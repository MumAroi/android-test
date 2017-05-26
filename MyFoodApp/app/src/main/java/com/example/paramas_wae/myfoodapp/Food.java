package com.example.paramas_wae.myfoodapp;

/**
 * Created by Paramas_wae on 26/5/2560.
 */

public class Food {

    private String name;
    private String description;

    public static final Food [] foods = {
            new Food("Pizza","Thin crust Pizza with extra cheese"),
            new Food("Burger","Veg burger with healthy stuff"),
            new Food("Sandwich","Whole wheat sandwich"),
    };

    public Food (String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName (){
        return name;
    }

    public String getDescription (){
        return description;
    }

    public String toString (){
        return this.name;
    }

}
