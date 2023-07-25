package LinkedList;

import java.util.List;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkList list = new LinkList(new Node<Integer>(12, null));
        list.add(new Node<Integer>(0, null));
        list.add(new Node<Integer>(13, null));
        list.add(new Node<Integer>(78, null));
        list.display();
        System.out.println("After Delete");
        list.delete();
        list.display();

    }

}
