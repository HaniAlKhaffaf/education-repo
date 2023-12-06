package oct15;
public class Main {
    public static void main(String[] args) {
        // The source code will be uploaded on moodle, therefore i will only take notes


        /*
         * 
         * 
         * Never change any of the code used in the file systems of the API
         * 
         * We have one object called person,
         * in order to create an object of person, we need the class called PersonBuilder,
         * why is it called person? because in the schema we decided so
         * 
         * PersonBuilder --> build() ---> Person
         * 
         * builder -> set methods
         * Person -> get methods
         * 
         * The file name of the proto can be anything, we can also have multiple messages in 
         * one proto class
         * 
         * Domain specific object --> is it same as builder design pattern?
         * 
         * Person using writeTo() --> Buffered OS --> OS --> Socket
         * 
         * Buffered OS is optional, we use it just to reduce the number of connections
         * 
         * if we didnt set one of the methods, like .setAge() as we skip it, what will happen?
         * It will basically send it as a default, so if int, then it will be 0
         * it is this way to save bytes
         * 
         * now how will the receive know whether we used the default or setAge(0); ??
         * answer -->  by using Optional in the proto class for the variable age.
         * 
         * How? because if we use optional, then if send setAge(0), it will serialize it
         *      meaning that it will send its bytes even if its 0, example
         * 
         * setAge(0) -> 68 bytes
         * setAge(0) and optional -> 70 bytes
         * 
         * therefore the reciever will be able to tell if actually set it or its default by using
         * the method hasAge(), as it will read the bytes
         * 
         * 
         * WRITING FILE TO OPERATING SYSTEM
         * something like   OutputStream os = new FileOutputStream("/path/path");
         *                  p.writeTo(os);
         *                  os.flush();s
         *                  os.close();
         * 
         * 
         *          NOW READING THE DATA FROM A SENDER
         * 
         * Basically same thing but we use a method called parseFrom();
         * since everything in binary, therefore we dont need to worry about receviing it in what language
         * 
         * 
         * 
         * 
         */
    }
}