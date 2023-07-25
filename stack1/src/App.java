public class App {
    public static void main(String[] args) throws Exception {
        StackArray<Integer> array = new StackArray<>(5);
        array.push(10);
        array.push(4);
        array.push(21);
        array.push(0);
        System.out.println("top  " + array.top);
        System.out.println(array.pop());
        System.out.println("top  " + array.top);
        // Dynamic
        System.out.println("Dynamic");
        StackArrayDynamic<Integer> dynamic = new StackArrayDynamic<>(3);
        dynamic.push(10);
        dynamic.push(4);
        dynamic.push(21);
        System.out.println("top  " + dynamic.top);
        System.out.println("size " + dynamic.array.length);
        dynamic.push(7);
        System.out.println("size " + dynamic.array.length);
        dynamic.pop();
        System.out.println("size " + dynamic.array.length);
    }
}
