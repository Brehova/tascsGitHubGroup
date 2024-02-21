package StringNumbers;

import java.util.Locale;

public class StrNumb {
    public static void main(String[] args) {
        printNum(12,13);
        printSeven();
    }
    //Задача 1
    //Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.
    public static String price(double pr){
        int c = (int) pr;
        int d = (int) ((pr - c) * 100);
        return c + " руб " + d + " коп";
    }

    //Задача 2
    //Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
    public static String wheith(double whei){
        int c = (int) whei;
        int d = (int) ((whei - c) * 1000);
        return c + " кг " + d + " гр";
    }

    //Задача 3
    //Написать метод, который распечатывает  последовательность чисел в промежутке [12, 13]
    // с шагом 0.1
    //
    public static void printNum(double a, double b){
        /*for (int i = a * 10; i < b * 10; i += 1) {
            System.out.println(i * 1.0 / 10);}*/
        for(double i = a; i < b; i = i + 0.1) {
            System.out.printf("%.1f%n", i);
            System.out.printf(Locale.ROOT,"%.1f", i);

            //String.format("%,.1f",d)
        }
    }
    //Задача 4
    //Написать метод, который распечатывает последовательность чисел, кратных 7,
    // в промежутке от 7 исключительно до 14 исключительно.
    public static void printSeven(){
        for (int i = 7; i < 14; i++) {
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
