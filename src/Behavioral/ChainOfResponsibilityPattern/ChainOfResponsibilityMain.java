package Behavioral.ChainOfResponsibilityPattern;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        //The Chain of Responsibility Pattern is a behavioral design pattern that allows a request to pass through a chain
        // of handlers, where each handler decides either to handle the request or pass it to the next handler in the chain.

        //used in ATM (notes handler ex: 500 -> 200 -> 100), Logger

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");
    }
}
