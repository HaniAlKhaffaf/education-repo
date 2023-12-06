package oct10;

import java.util.Scanner;

public class SwitchGrades {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

    int num = input.nextInt();

    switch(num / 10){ // we divided by 10 so that we reduce the number of cases
        case 10:
            System.out.println("A");
            break;
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        default:
            System.out.println("F");
}
    }

}
