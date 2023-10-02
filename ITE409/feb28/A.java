package feb28;

public class A {
    public void test() {
        // int z = 100/0;
        InvalidStudentException ste = new InvalidStudentException(0);
        throw ste;

        // you can create the try and catch here
    }
}
