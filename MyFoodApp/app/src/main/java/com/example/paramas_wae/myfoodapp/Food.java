package com.example.paramas_wae.myfoodapp;

/**
 * Created by Paramas_wae on 26/5/2560.
 */

public class Food {

    private String name;
    private String description;
    private int imageID;

    public static final Food [] foods = {
            new Food("Pizza","Thin crust Pizza with extra cheese",R.drawable.aaa01),
            new Food("Burger","Veg burger with healthy stuff",R.drawable.aaa02),
            new Food("Sandwich","Whole wheat sandwich",R.drawable.aaa03),
    };

    public Food (String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public String getName (){
        return name;
    }

    public String getDescription (){
        return description;
    }

    public int getImageID() {
        return imageID;
    }

    public String toString (){
        return this.name;
    }

}
