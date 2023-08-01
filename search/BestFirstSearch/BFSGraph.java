import java.util.LinkedList;
import java.util.Queue;
import Depth_First_Search.AdjList;
import Depth_First_Search.Node;

public class BFSGraph {
    // The size of the graph.
    int size;
    // An array of adjacency lists.
    AdjList[] arrLists;
    // Constructs a new BFSGraph with the given size.
    public BFSGraph(int size) {
        // Initialize the size of the graph.
        this.size = size;
        // Initialize the adjacency lists.
        arrLists = new AdjList[this.size];
        for (int i = 0; i < size; i++) {
            // Initialize each adjacency list to be empty.
            arrLists[i] = new AdjList();
            arrLists[i].head = null;
        }
    }

    // Adds a node to the graph.
    public void addNode(int src, int dest) {
        // Create a new node with the given destination.
        Node n = new Node(dest, null);
        // Add the node to the adjacency list of the source vertex.
        n.next = arrLists[src].head;
        arrLists[src].head = n;
    }
    // Performs a breadth-first search of the graph starting from the given vertex.
    public void BFSExplore(int startVertex) {
        // Initialize a boolean array to keep track of visited vertices.
        boolean[] visited = new boolean[size];
        // Initialize all vertices to unvisited.
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        // Create a queue to store the vertices to be visited.
        Queue<Integer> queue = new LinkedList<>();
        // Add the start vertex to the queue.
        queue.add(startVertex);
        // While the queue is not empty, do the following:
        while (!queue.isEmpty()) {
            // Remove the first vertex from the queue.
            int n = queue.poll();
            // Print the vertex.
            System.out.println("Visit: " + n);
            // Mark the vertex as visited.
            visited[n] = true;
            // Get the head of the adjacency list for the vertex.
            Node head = arrLists[n].head;
            // While the head of the adjacency list is not null, do the following:
            while (head != null) {
                // If the next vertex is not visited, add it to the queue.
                if (visited[head.dest] == false) {
                    queue.add(head.dest);
                    visited[head.dest] = true;
                }
                // Move to the next vertex in the adjacency list.
                head = head.next;
            }
        }
    }

    public int search(int startVertex, int destination) {
        // Initialize a boolean array to keep track of visited vertices.
        boolean[] visited = new boolean[size];
        // Initialize all vertices to unvisited.
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        // Create a queue to store the vertices to be visited.
        Queue<Integer> queue = new LinkedList<>();
        // Add the start vertex to the queue.
        queue.add(startVertex);
        // While the queue is not empty, do the following:
        while (!queue.isEmpty()) {
            // Remove the first vertex from the queue.
            int n = queue.poll();
            // If the vertex is the destination, return it.
            if (n == destination) {
                return n;
            }
            // Mark the vertex as visited.
            visited[n] = true;
            // Get the head of the adjacency list for the vertex.
            Node head = arrLists[n].head;
            // While the head of the adjacency list is not null, do the following:
            while (head != null) {
                // If the next vertex is not visited, add it to the queue.
                if (visited[head.dest] == false) {
                    queue.add(head.dest);
                    visited[head.dest] = true;
                }
                // Move to the next vertex in the adjacency list.
                head = head.next;
            }
        }
        // The destination vertex was not found.
        return -1;
    }
}
// public class BFSGraph {
// int size;
// AdjList[] arrLists;

// public BFSGraph(int size) {
// this.size = size;
// arrLists = new AdjList[this.size];
// for (int i = 0; i < size; i++) {
// arrLists[i] = new AdjList();
// arrLists[i].head = null;
// }
// }

// public void addNode(int src, int dest) {
// Node n = new Node(dest, null);
// n.next = arrLists[src].head;
// arrLists[src].head = n;
// }

// public void BFSExplore(int startVertex) {
// boolean[] visited = new boolean[size];
// for (int i = 0; i < visited.length; i++) {
// visited[i] = false;
// }
// Queue<Integer> queue = new LinkedList<>();
// queue.add(startVertex);
// while (!queue.isEmpty()) {
// int n = queue.poll();
// System.out.println("Visit: " + n);
// visited[n] = true;
// Node head = arrLists[n].head;
// while (head != null) {
// if (visited[head.dest] == false) {
// queue.add(head.dest);
// visited[head.dest] = true;
// } else {
// head = head.next;
// }
// }
// }
// }
// }
