package beforeMar1;
import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        // Initialize the scores array
        int[][][] scores = {
            {
                {95, 67, 72, 67},
                {61, 88, 78, 76},
                {76, 80, 98, 87}
            },
            {
                {91, 56, 34, 67},
                {61, 88, 78, 76},
                {76, 80, 98, 87}
            },
            {
                {95, 67, 72, 67},
                {61, 88, 78, 76},
                {76, 80, 98, 87}
            }
        };

        // Find the highest score for a specific module in a specific department
        int department = 1; // department number, 0-indexed
        int module = 2; // module number, 0-indexed
        int highestScore = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (i == department && scores[i][module] > highestScore) {
                highestScore = scores[i][module];
            }
        }
        System.out.println("Highest score in department " + department + " module " + module + " is " + highestScore);

        // Find the highest score among all the modules in each department
        for (int i = 0; i < scores.length; i++) {
            int highestScoreInDepartment = Integer.MIN_VALUE;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > highestScoreInDepartment) {
                    highestScoreInDepartment = scores[i][j];
                }
            }
            System.out.println("Highest score in department " + i + " is " + highestScoreInDepartment);
        }
    }
}