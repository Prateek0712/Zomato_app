import java.util.*;
public class restro {
    private String restroName;
    private List<dish>menu;
    restro(String restroName)
    {
        this.restroName=restroName;
        this.menu=new ArrayList<>();
    }
    public void addDishes(String dishName,int price)
    {
        menu.add(new  dish(dishName,price));
    }

    public List<dish> getMenu() {
        return menu;
    }

    public void setMenu(List<dish> menu) {
        this.menu = menu;
    }

    public void displayMenu()
    {
        int idx=0;
        for(dish d:menu)
        {
            System.out.println(restroName+" "+"DishNo :"+idx+" "+d.getName()+" "+d.getPrice());
            idx++;
        }
    }
}
