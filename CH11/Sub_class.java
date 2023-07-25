package CH11;

class Super_class {
    int num = 20;

    public void display() {
        System.out.println(
                "This is the display method of superclass");
    }
}

public class Sub_class extends Super_class {
    int num = 10;

    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void myMethod() {
        Sub_class sub = new Sub_class();
        super.display();
        sub.display();
        System.out.println(
                "value of the variable named num in sub class: " + sub.num);
        System.out.println(
                "value of the variable named num in super class: " + super.num);
    }

    public static void main(String[] args) {
        Sub_class class1 = new Sub_class();
        class1.myMethod();
    }
}
