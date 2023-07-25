package TestTwo;

public interface Print {
    void print();

}

class TestPrint implements Print {

    @Override
    public void print() {
        System.out.println("TestPrint");
    }

    public static void main(String[] args) {
        TestPrint testPrint = new TestPrint();
        testPrint.print();
    }
}