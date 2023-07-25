package codeWars;

import java.util.Scanner;

public class KeepHydrated {
    final double LITRES = 0.5;
    private double time;
    private double num;

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int liters(double time) {
        double litres = time * 0.5;
        return (int) Math.floor(litres);
        // if (time > 0) {
        // num = LITRES * time;
        // Math.floor(num);
        // return (int) num;
        // } else {
        // return -1;
        // }

    }

    @Override
    public String toString() {
        return "time = " + time + "----> litres = " + liters(time);
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time");
        double hour = input.nextDouble();
        KeepHydrated kh = new KeepHydrated();
        kh.setTime(hour);
        System.out.println(kh);
    }
}
