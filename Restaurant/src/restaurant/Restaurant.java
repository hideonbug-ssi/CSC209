/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

/**
 *
 * @author User
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food padthai = new Food(1, "Padthai", 49, 200, (short)4);
        System.out.println(padthai.toString());
        padthai.setCategory("noodle");
        padthai.addIngredient("shrimp");
        padthai.addIngredient("noodle");
        padthai.addIngredient("bean sprout");
        padthai.addIngredient("egg");
        System.out.println(padthai.ingredients.elementAt(0)+", "+padthai.ingredients.elementAt(2));
        
        Food tomyum = new Food(2, "Tomyum", 249.50, 500, (short) 5);
        tomyum.setCategory("seafood");
        tomyum.addIngredient("shrimp");
        tomyum.addIngredient("lemon");
        tomyum.addIngredient("chilli pepper");
        
        Food coke = new Food(3, "Coca Cola", 20, 150, (short)3);
        Food pepsi = new Food(4, "Pepsi", 20, 150, (short)3);
        Food fanta = new Food(5, "Fanta", 20, 150, (short)2);
        
        Menu menu = new Menu();
//        menu.addNewFood(padthai);
//        menu.addNewFood(pepsi);
//        menu.addNewFood(tomyum);
//        menu.addNewFood(coke);
//        menu.addNewFood(fanta);
//        menu.showAllfood();
//        menu.removeFood(2);
//        menu.showAllfood();
        menu.readAllRecord();
        boolean x = menu.searchByName("Padthai");
        System.out.println(x);
        menu.showNamePrice((short)4);
    }
    
}
