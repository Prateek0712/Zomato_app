import java.util.*;
public class order {
    private List<dish>orderList;

    public user getUser() {
        return User;
    }

    public void setUser(user user) {
        User = user;
    }

    public int getBill() {
        return bill;
    }

    private user User;
    private int bill;
    order(user User)
    {
        orderList=new ArrayList<>();
        this.User=User;
    }
    public void addOrder(restro rs,int dishNo)
    {
        dish d=rs.getMenu().get(dishNo);
        orderList.add(d);
        bill+=d.getPrice();
    }

    public void display_TotalOrder()
    {
        int idx=0;
        for(dish d:orderList)
        {
            System.out.println("Item No :"+idx+" "+d.getName()+" "+d.getPrice());
            idx++;
        }
        System.out.println("Your Total Bill is "+bill);
    }
}
