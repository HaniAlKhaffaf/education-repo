package oct10;

public class Switch {

    // switch isnt important in java, but its just more intuitive 
    // in if, if you have < less than or >greater than, then it isnt good to use a switch instead of the if
    // switches are best used when u have the condition using == 

    public static void main(String[] args) {
        int grade = 1;
        switch(grade){
            case 1: 
                System.out.println("1");
                break;
            case 2: 
                System.out.println("2");
                break;
            case 3:
            case 4:
                System.out.println("3 or 4"); // this can be used as an OR 
            default:
                System.out.println("default");
        }


        System.out.println("after the switch");
    }
}