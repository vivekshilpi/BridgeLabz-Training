package com.optionalclassscenario;
import java.util.*;

public class OptionalSystemUtility {

    public static void main(String[] args) {

        String configValue = null;
        String envVariable = null;
        String filePath = null;
        String apiResponse = null;
        String userPreference = null;

        // 1. Read configuration value safely
        System.out.println("----- Config Value -----");
        System.out.println(Optional.ofNullable(configValue).orElse("Default Config"));

        // 2. Fetch environment variable
        System.out.println("\n----- Environment Variable -----");
        System.out.println(Optional.ofNullable(envVariable).orElse("Default ENV"));

        // 3. Return default file path if missing
        System.out.println("\n----- File Path -----");
        System.out.println(Optional.ofNullable(filePath).orElse("/default/path"));

        // 4. Handle API response safely
        System.out.println("\n----- API Response -----");
        System.out.println(Optional.ofNullable(apiResponse).orElse("No Response"));

        // 5. Fetch user preferences safely
        System.out.println("\n----- User Preference -----");
        System.out.println(Optional.ofNullable(userPreference).orElse("Default Preference"));
    }
}
