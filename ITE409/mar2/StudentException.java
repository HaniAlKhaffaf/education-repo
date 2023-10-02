package mar2;

public class StudentException extends RuntimeException{

    // the difference between extending RuntimeException and Exception,
    // is that Exception, it will force the try and catch and you can include
    // the ThrowS signture, but for RuntimeException, it doesn't matter if
    // you use ThrowS or not, because it only cares about Runtime

    // The whole idea for ThrowS, is that it will enforce you to use try
    // and catch, therefore, it will eliminate the possibility of having
    // a runtime error.

    // when you Throw and use class Exception, you have to use signture
    // ThowS which enforces you to use try and catch because of compilation
     
    // when you use ThrowS Signture in the main method (the main caller)
    // then that means you want the user to handle the error
}
