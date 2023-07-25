package CH13;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = { new Tiger(), new Chicken(), new Apple() ,new Orange()};
        Edible test = new Apple();
        Edible result;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible)
                System.out.println(((Edible) objects[i]).howToEat());
            if (objects[i] instanceof Animal)
                System.out.println(((Animal) objects[i]).sound());
        }
    }
}

// ! Class Animals
abstract class Animal {
    private double weight;

    // public double getWeight() {
    //     return weight;
    // }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sound();
}

// * class Chicken
class Chicken extends Animal implements Edible {
    public String howToEat() {
        return "chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cook-a-doodle-doo";
    }
}

// ! class TIGER
class Tiger extends Animal {
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {
    public abstract String howToEat();
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}