package Test;

public class Test3 {
  public static void main(String[] args) {
    int i = 4;
    double x = i;
    System.out.println(x);

  }

}

class Superclass implements Comparable<Superclass> {
  private int a;
  private String name;

  public Superclass(int a, String name) {
    this.a = a;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public void print() {
    System.out.println("This is the Superclass's print() method.");
  }

  public boolean compareBooks(Superclass s, Superclass su) {
    return s.name.equals(su.name);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Superclass) {
      Superclass s = (Superclass) obj;
      if (this.a == s.a && this.name.equals(s.name)) {
        return true;
      }
    }
    return false;

  }

  @Override
  public int compareTo(Superclass o) {
    if (this.a > o.a) {
      return 1;
    } else if (this.a < o.a) {
      return -1;
    } else {
      return 0;
    }
  }
}
