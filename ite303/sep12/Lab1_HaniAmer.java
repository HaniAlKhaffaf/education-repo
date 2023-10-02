package sep12;
import java.util.Scanner;

public class Lab1_HaniAmer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in Kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter the Height in Meters: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);

        if (BMI < 18.5){
            System.out.println("Underweight");
        }else if(BMI <= 24.9){
            System.out.println("Normal");
        }else if(BMI <= 30){
            System.out.println("overweight");
        }else{
            System.out.println("obese");
        }



    }
}