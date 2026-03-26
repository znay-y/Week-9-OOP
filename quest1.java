public class quest1 {
    public static void main(String[] args) {
        getElement(args, 0);
    }

    static String getElement(String[] array, int index) {
        try {
            return array[index];
        } catch (Exception e) {
            System.out.println("Index is out of array");
            return null;
        }
    }
}
