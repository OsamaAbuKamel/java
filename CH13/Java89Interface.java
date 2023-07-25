package CH13;

public interface Java89Interface {
    int x=0;
    
    public default void doSomething(){
        System.out.println("Do Something");
    }
    public static int getValue(){
        return 1;
    }
   
    private static int getAStaticValue(){
        return 1;
    }
    private void performPrivateAction() {
    }    
}
