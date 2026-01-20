package geo_measure;

public class LineService {

    public String compareLines(Line l1, Line l2) {
        double len1 = l1.calculateLength();
        double len2 = l2.calculateLength();

        if (len1 == len2) {
            return "Both lines are equal in length.";
        } 
        else if (len1 > len2) {
            return "Line 1 is longer than Line 2.";
        } 
        else {
            return "Line 2 is longer than Line 1.";
        }
    }
}

