import java.util.*;
public class DeliveryPartner {
    List<driver>driverList=new ArrayList<>();
    public void assignDriver(order o)
    {
        if(driverList.size()==0)
        {
            System.err.println("NO DRIVER AT  THIS MOMENT");
        }
        else
        {
            driver d=driverList.remove(0);
            System.out.println("order assign  to "+d.getDname()+" this driver");
        }
    }
    public void addDriver(driver d)
    {
        driverList.add(d);
    }
    public void deliver(order o) {
        System.out.println("Delivering order to " + o.getUser().getName());
        // Simulate delivery process
        System.out.println("Order delivered successfully!");
    }


}
