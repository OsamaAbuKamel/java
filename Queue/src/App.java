public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<>(4);
        queue.queue(5);
        queue.queue(7);
        queue.queue(4);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}
