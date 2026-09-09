package pizza;
import java.util.List;

import pizza.enums.*;


public class Pizza {
    protected Size size;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Topping> topping;
    protected Boolean extraCheese;
    protected Boolean glutenFreeDough;
    protected SpicyLevel spicyLevel;
    protected Boolean vegetarian;

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void addTopping(Topping topping) {
        this.topping.add(topping);
    }

    public void setExtraCheese(Boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setGlutenFreeDough(Boolean glutenFreeDough) {
        this.glutenFreeDough = glutenFreeDough;
    }

    public void setSpicyLevel(SpicyLevel spicyLevel) {
        this.spicyLevel = spicyLevel;
    }
    
    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
