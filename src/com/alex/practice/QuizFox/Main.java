package com.alex.practice.QuizFox;

public class Main {
    public static void main(String[] args) {
        Fox fox = new Fox("рыжий");
        fox.setWeight(5.93d);
        fox.setAge(5);

        System.out.println("Вес лисы - " + fox.getWeight());
        System.out.println("Возраст лисы - " + fox.getAge());
        System.out.println("Цвет лисы - " + fox.getColor());
        System.out.println("Лиса говорит - " + fox.say());

    }
}
