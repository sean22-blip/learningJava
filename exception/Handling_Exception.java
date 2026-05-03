package exception;

public class Handling_Exception {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            // This will never be reached
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero.");
        } catch (Exception e) {
            System.out.println("General error.");
        }//Tip: Always put Exception (the general one) at the end.
    }
}
