

public class quest3 {
public static void main(String[] args) {
    getStringLength(null);
   
}


static int getStringLength(String s){
   try {
        return s.length();
    } catch (NullPointerException e) {
        System.out.println("Null passed :(");
        return 0;
    }
    finally{
        System.out.println("Execution completed");
    }
        
     
}
}

