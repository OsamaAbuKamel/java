package CH11;

public class Instance {
    public static void main(String[] args) {
        Object obj = new Integer(10);
        if (obj instanceof Integer) {
            System.out.println("obj is an instance of Integer");
        }
        Integer i = (Integer) obj;
        System.out.println("The value of i is " + i);
    }

}
