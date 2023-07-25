package ArrayDS;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray();
        array.put(4);
        System.out.println("Size: " + array.getSize());
        array.put(43);
        System.out.println("Size: " + array.getSize());
        array.put(43);
        System.out.println("Size: " + array.getSize());

    }

}
