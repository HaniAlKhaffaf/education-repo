package sep28;

public class DoWhileLoop{

    // if       -> single-selection structure
    // if-else  -> double-selection structure
    // switch   -> multiple-selection structure

    public static void main(String[] args) {

        // syntax as following
        int counter = 1;
        do{
            System.out.print(counter + " ");
            counter++;
        }while(counter <= 5);
    }
}