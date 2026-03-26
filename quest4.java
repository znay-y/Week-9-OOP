public class quest4 {
    public static void main(String[] args) {
        int number = -5; // try changing this to a positive number later

        try {
            if (number < 0) {
                throw new InvalidInputException("Number cannot be negative");
            }

            System.out.println("Valid number: " + number);

        } catch (InvalidInputException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    InvalidInputException(String messge) {
        super(messge);
    }
}
