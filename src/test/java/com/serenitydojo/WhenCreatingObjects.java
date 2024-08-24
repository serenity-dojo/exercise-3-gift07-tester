package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_cat(){
        String name = "felix";
        String favoriteFood = "Tuna";
        int age = 5;

        Cat felix = new Cat("Felix","Tuna",5);
        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat("Spot","Salmon",3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());




    }

    @Test
    public void creating_a_dog(){
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido","Bone",5);
        Assert.assertEquals(fido.getName(),"Fido");
        Assert.assertEquals(fido.getFavoriteToy(),"Bone");
        Assert.assertEquals(fido.getAge(),5);




    }


}
