package com.json.iplcensoranalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class JsonCensor {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON array
            JsonNode matches = mapper.readTree(new File("src/com/json/iplcensoranalyzer/ipl.json"));

            for (JsonNode match : matches) {

                // Mask teams
                ((ObjectNode) match).put(
                        "team1",
                        CensorUtil.maskTeam(match.get("team1").asText())
                );
                ((ObjectNode) match).put(
                        "team2",
                        CensorUtil.maskTeam(match.get("team2").asText())
                );

                // Mask winner
                ((ObjectNode) match).put(
                        "winner",
                        CensorUtil.maskTeam(match.get("winner").asText())
                );

                // Redact player of match
                ((ObjectNode) match).put(
                        "player_of_match",
                        CensorUtil.redactPlayer()
                );

                // Mask score keys
                ObjectNode scoreNode = (ObjectNode) match.get("score");
                ObjectNode newScore = mapper.createObjectNode();

                Iterator<Map.Entry<String, JsonNode>> fields = scoreNode.fields();
                while (fields.hasNext()) {
                    Map.Entry<String, JsonNode> entry = fields.next();
                    newScore.put(
                            CensorUtil.maskTeam(entry.getKey()),
                            entry.getValue().asInt()
                    );
                }

                ((ObjectNode) match).set("score", newScore);
            }

            // Write censored JSON
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File("censored_ipl.json"), matches);

            System.out.println("Censored JSON file created!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

