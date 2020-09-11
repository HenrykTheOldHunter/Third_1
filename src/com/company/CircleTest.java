package com.company;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите диаметр окружности: ");
        circle.setDiam(in.nextInt());

        System.out.println("Введите радиус окружности: ");
        circle.setRad(in.nextInt());

        System.out.println("Введите площадь окружности: ");
        circle.setArea(in.nextInt());

        System.out.println(circle.getDiam() + " " + circle.getRad() + " " + circle.getArea());
    }
}
