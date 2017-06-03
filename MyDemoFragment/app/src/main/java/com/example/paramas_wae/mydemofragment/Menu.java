package com.example.paramas_wae.mydemofragment;

/**
 * Created by Paramas_wae on 3/6/2560.
 */

public class Menu {

    private String name;
    private String description;

    public static final Menu[] menus = {
            new Menu("Breakfast","2 Whole eggs \n Bread \n Coffee"),
            new Menu("Luch","3 Whole eggs \n Brocolli"),
            new Menu("Dinner","Brown rice \n Potato \n Brocolli")
    };

    private Menu(String name, String description){
            this.name = name;
            this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
