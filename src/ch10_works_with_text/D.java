package ch10_works_with_text;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i*2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
