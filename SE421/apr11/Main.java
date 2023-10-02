package apr11;

public class Main{
    public static void main(String[] args) {
        
    // Dependency Injection (DI)
    // each service would need a class, with DI, it will help optimize the classes
    // so if you have 10 services, you will need 10 classes, with DI, you can 
    // have maximum of 2-3 classes for all of the services


    // Factory classes has disadvantage of having many factory classes that
    // you have to create and maintain

    // DI, doesnt need special classes such as factory classes
    // It uses the Constructor of the processMangaer to identify the services
    // less classes basically
    // disadvantage is that it is impractical by default
    // without using an api, but after using api then it is good and usable

    // everytime you need to implement services, you have to check them
    // manually

    }
}