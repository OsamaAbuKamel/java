package CH13;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> , Cloneable {
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    // @Override
    // public int compareTo(Object o) {
    //     GeometricObject o1 = (GeometricObject) o;
    //     if (o instanceof ComparableRectangle)
    //         if (getArea() > ((GeometricObject) o).getArea()) {
    //             return 1;
    //         } else if (getArea() < ((GeometricObject) o).getArea()) {
    //             return -1;
    //         }
    //     return 0;
    // }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + "{" +
                "}";
    }

    

}
