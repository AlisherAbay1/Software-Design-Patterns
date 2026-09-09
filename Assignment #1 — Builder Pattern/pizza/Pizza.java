package pizza;

import java.util.ArrayList;
import java.util.List;
import pizza.enums.*;

public class Pizza {
    private Size size;
    private Dough dough;
    private Sauce sauce;
    private List<Topping> toppings = new ArrayList<>();
    private Boolean extraCheese = false;
    private Boolean glutenFreeDough = false;
    private SpicyLevel spicyLevel = SpicyLevel.NONE;
    private Boolean isVegetarian = false;

    public void setSize(Size size) { this.size = size; }
    public void setDough(Dough dough) { this.dough = dough; }
    public void setSauce(Sauce sauce) { this.sauce = sauce; }
    public void addTopping(Topping topping) { this.toppings.add(topping); }
    public void setExtraCheese(Boolean extraCheese) { this.extraCheese = extraCheese; }
    public void setGlutenFreeDough(Boolean glutenFreeDough) { this.glutenFreeDough = glutenFreeDough; }
    public void setSpicyLevel(SpicyLevel spicyLevel) { this.spicyLevel = spicyLevel; }
    public void setVegetarian(Boolean isVegetarian) { this.isVegetarian = isVegetarian; }

    @Override
    public String toString() {
        return "Pizza {size=" + size + ", dough=" + dough + ", sauce=" + sauce +
               ", toppings=" + toppings + ", extraCheese=" + extraCheese +
               ", glutenFree=" + glutenFreeDough + ", spicyLevel=" + spicyLevel +
               ", isVegetarian=" + isVegetarian + "}";
    }
}