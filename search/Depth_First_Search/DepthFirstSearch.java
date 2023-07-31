import java.util.Stack;

public class DepthFirstSearch {
    int size;
    AdjList[] arrLists;

    public DepthFirstSearch(int size) {
        this.size = size;
        arrLists = new AdjList[this.size];
        for (int i = 0; i < size; i++) {
            arrLists[i] = new AdjList();
            arrLists[i].head = null;
        }
    }

    public void addNode(int src, int dest) {
        Node n = new Node(dest, null);
        n.next = arrLists[src].head;
        arrLists[src].head = n;
    }

    public void DFSExplore(int startVertex) {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            int n = stack.pop();
            stack.push(n);
            visited[n] = true;
            Node head = arrLists[n].head;
            boolean isDone = true;
            while (head != null) {
                if (visited[head.dest] == false) {
                    stack.push(head.dest);
                    visited[head.dest] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }

            }
            if (isDone == true) {
                int outN = stack.pop();
                System.out.println("Visit node " + outN);
            }
        }

    }

    public void DFSSearch(int startVertex, int search) {
        boolean[] visited = new boolean[size];
        boolean isFound = false;
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            int n = stack.pop();
            stack.push(n);
            visited[n] = true;
            Node head = arrLists[n].head;
            boolean isDone = true;
            while (head != null) {
                if (search == head.dest) {
                    System.out.println("Node Is Found ");
                    isFound = true;
                    break;
                }
                if (visited[head.dest] == false) {
                    stack.push(head.dest);
                    visited[head.dest] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }
            }
            if (isFound == true) {
                break;
            }
            if (isDone == true) {
                int outN = stack.pop();
                System.out.println("Visit node " + outN);
            }
        }
        if (isFound == false) {
            System.out.println("Node Cannot Found ");
        }
    }

}
