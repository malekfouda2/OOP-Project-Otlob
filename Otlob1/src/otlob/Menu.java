/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otlob;

/**
 *
 * @author malek
 */
public class Menu extends Restaurant {
private String RestaurantNames;
private String FoodType;
    public Menu(String name, String priceRange, String category, int id,String FoodType) {
        super(name, priceRange, category, id);
    }

    public Menu() {
    }

    public String getRestaurantNames() {
        return RestaurantNames;
    }

    public void setRestaurantNames(String RestaurantNames) {
        this.RestaurantNames = RestaurantNames;
    }

    public String getFoodType() {
        return FoodType;
    }

    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }
    
    
}
