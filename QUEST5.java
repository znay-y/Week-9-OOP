/*
that processes a given string according to the following rules:

- If `name` is `null`, throw an `InvalidInputException`
- If `name` is empty, throw an `InvalidInputException`
- Otherwise, return the name in **uppercase**

Then:

- Call this method inside a `try` block
- Catch the exception and print its message
*/
public class QUEST5 {
    public static void main(String[] args) {
        try {
            String name = processName(null);
            System.out.println(name);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    static String processName(String name) throws InvalidInputException {

        if (name==null) {
            throw new InvalidInputException("Name cannot be null");

        } else if (name.equals("")) {
            throw new InvalidInputException("Name cannot be left empty");

        } else {
            return name.toUpperCase();
        }

    }
}

class InvalidInputException extends Exception {
    InvalidInputException(String messge) {
        super(messge);
    }
}
