package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Имя?");
        Scanner s = new Scanner((System .in));
        System.out.println("Введите свое имя:");
        String name = s.nextLine();
        System.out.println("Введите ваш возраст:");// разобрался как-то с scaner
        int ar = s.nextInt();

        String a;
        a = (name);
        int temp = (int) (10 + Math.random() * 20);//я решил сделать более уникальную версию домашки.Я соединил 1 и 2 homework
        int age = (ar);
        boolean IsRainy = true;

        if (age > 20 && age < 45 && temp < 30 && temp > -20 && IsRainy){
            System.out.println(a + ",можно идти гулять");
        }else if (age < 20 && temp > 0 && temp < 28 && IsRainy){
            System.out.println(a +",можешь идти на улицу!");
        }else if (age > 45 && temp > -10 && temp < 25 && IsRainy) {
            System.out.println(a + ",можно идти проветриться");
        }else {
            System.out.println(a + ",лучше сегодня побыть дома!");// оказывается это легче чем кажется.Всего-то 2 часа
        }                                                               //и ты начнешь многое понимать))
    }
}
