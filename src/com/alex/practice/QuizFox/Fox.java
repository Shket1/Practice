package com.alex.practice.QuizFox;

public class Fox extends Animal{
    private String Color;

    public Fox( String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String say() {
        return "Мяу мяй Mother fucka";
    }
}
