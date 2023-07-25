package Ch15;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {
    public static void main(String[] args) {
        DoubleProperty balnce = new SimpleDoubleProperty();
        balnce.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable arg0) {
                System.out.println("the new value is  " + balnce.doubleValue());
            }
        });

        balnce.set(4.5);
    }
}
