package otlob;//class geded!
import java.util.ArrayList;
import java.io.Serializable;
public class Items implements Serializable{
private String name;
private int cost;

    public Items(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public Items()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

}
