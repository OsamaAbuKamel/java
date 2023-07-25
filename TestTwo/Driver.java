package TestTwo;

record Name(String first, String last) {
    public Name() {
        this("", "");
    }

}

public class Driver {
    public static void main(String[] args) {
        Vehicle[] store = { new Car(), new Motorcycle() };
        for (int i = 0; i < store.length; i++) {
            if (store[i] instanceof Car) {
                store[i].start();
                store[i].stop();
                store[i].convert();
            } else if (store[i] instanceof Motorcycle) {
                store[i].start();
                store[i].stop();
                store[i].convert();
            }
        }
        // Name n = new Name("John", "Doe");
        // Name n1 = new Name("John", "Doe");
        // System.out.println(n.compareTo(n1));
        // System.out.println(n.first());
        // System.out.println(n.last());
    }

}
