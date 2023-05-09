/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.util.Vector;

/**
 *
 * @author User
 */
public class Food {
    int ID;
    String name;
    String category;
    double price;
    int calories;
    short star;
    Vector ingredients;

    public Food(int ID, String name, double price, int calories, short star) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.star = star;
        ingredients = new Vector(10);
    }

    public void setCategory(String category) {
        String validCategory[] = {"noodle","appetizer","beef","pork", "vegetarian"
                                  ,"chicken","seafood","dessert","drink"};
        for(String a : validCategory){
            if(category.equalsIgnoreCase(a)){
               this.category = category;
               return;
            }
        }
        System.out.println("Not valid category");
    }
    
    public int addIngredient(String newIngredient){
        ingredients.add(newIngredient);
        return ingredients.size();
    }
    
    public String toString(){
        return name + " of " + price + " baht with " + star + "*.";
    }

}
