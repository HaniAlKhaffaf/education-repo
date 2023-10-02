package sep17;
import java.util.Scanner;
public class GradesToLetter{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt(); 
        if(grade < 60) {
            System.out.println("F");
        } else if(grade < 70) {
            System.out.println("D");
        } else if(grade < 80) {
            System.out.println("C");
        } else if(grade < 90) {
            System.out.println("B");
        } else if(grade <= 100) {
            System.out.println("A");
        }

        int x = 1;
        int y = x!=1 ? 10 : 20; // this is called terinary operator
                                // important in exam
                                // it is restrictive 
        System.out.println(y);

        // if any language has three things, then it can write an Algorithm 
        // 1- sequence structure
        // 2- selection structure --> if, if-else, switch
        // 3- repetition structure --> for, while, do-while

    }
}