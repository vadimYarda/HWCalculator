package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //Не будет работать потому что на ноль делить нельзя
        // int c = calc.devide.apply(a, b);
        if (b != 0) {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else {
            System.out.println("Ошибка: на 0 делить нельзя!");
        }
    }
}