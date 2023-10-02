package mar2;

public class Main {
    public static void main(String args[]) {

        try {
            System.out.println("HEllO");
            throw new RuntimeException();
            // we want to execute this code -> System.out.println("Important");
        }catch(Exception e) {
            System.err.println("ERROR");
        }finally{
            System.out.println("IMPORTANT");
            // this is where finally comes in handy, it executes the code no 
            // matter what type of error we get, its like a last resolution
            //
        }


        // ASIACELL QUESTION
        // try{
        //     System.out.println("Hello");
        //     return
        //     System.out.println("Byte");
        // }finally{
        //     System.out.println("End");
        // }
        // in there after the method is returned, then the finally will still
        // run regardless of any return.

        //finally is mainly used for cleanup

        // try {
        //     funcA();
        // }catch(Exception e) {

        // }


        // try {
        //     System.out.println(name.toString());
        // }catch(NullPointerException e){

        // }catch(Exception e) {}
        // // The exceptions should have hierarchy

    }

    public static void funcA() throws StudentException{
        StudentException e = new StudentException();
        throw e;
        // using Throws extention, will force the compiler to force the user
        // to use try and catch calling funcA, so its like making your
        // code more robust (Throws used in the part of the signture)
    }

    public static void funcB() {

    }
}
