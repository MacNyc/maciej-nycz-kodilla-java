package Ordering;

 public class Application {
     public static void main(String[] args) {
         OrderRequestRetriever orr = new OrderRequestRetriever();
         OrderRequest request = orr.retrieve();

     }

     private static void printError(String message) {
         System.out.println("ERROR: " + message);
     }

     private static void printInfo(String message) {
         System.out.println("INFO: " + message);
     }

     private static void printWarning(String message) {
         System.out.println("WARNING: " + message);
     }
 }
