package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;
    static final String Cat_Noise = "Meow";

    public static String usualFood(){
        return "Tuna";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.favoriteFood = usualFood();
    }


    public Cat(String name, String favoriteFood, int age){
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }


    public String getName(){
        return name;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public int getAge(){
        return age;
    }


    public void makeSound() {
        System.out.println(name + " goes " + Cat_Noise);
    }

    public void feed(String food) {
        System.out.println(name + " eats " + food);
    }

    public void groom() {
        lickPaw();
        lickFur();

    }

    private void lickFur() {
        System.out.println(name + " licks fur");
    }

    private void lickPaw() {
        System.out.println(name + " licks paw");
    }
}
