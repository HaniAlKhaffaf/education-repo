package sep17;
public class WhileLoop{
    public static void main(String[] args) {
       int counter = 0;
       while(counter < 5) {
        System.out.println("Hi "); 
        counter = counter + 1; // remember to always keep this line at the end
        // question: what is sentinal controller (sentinal loop)
       } 
       // while(counter < 5) ; { in here the line wont execute because of the semi colon
       // block of code 
       //}
    }
}