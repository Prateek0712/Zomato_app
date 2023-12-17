import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<restro>rsList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        restro r1=new restro("Accio foodHub");
        r1.addDishes("pizza ",300);
        r1.addDishes("pasta",120);
        r1.addDishes("burger",150);
        restro r2=new restro("Tushar Icecream Parlour");
        r2.addDishes("ChocoLate Icecream",100);
        r2.addDishes("American DryFruits",100);
        r2.addDishes("Tushar's Special",200);
        rsList.add(r1);
        rsList.add(r2);
        driver driver1 = new driver("Driver 1");
        driver driver2 = new driver("Driver 2");

        // Adding drivers to the delivery service
        DeliveryPartner ds=new DeliveryPartner();
        ds.addDriver(driver1);
        ds.addDriver(driver2);
        for(int i=0;i<rsList.size();i++)
        {
            System.out.println("Restrorant  No: "+(i+1));
            rsList.get(i).displayMenu();
        }
        System.out.println("Enter Your Name");
        String us1=sc.nextLine();
        user u1=new user(us1);
        System.out.println("Do You want Order Something say y/n");
        String choise=sc.next();
        if(choise.equals("y"))
        {
            boolean flag=true;
            while(flag)
            {
                System.out.println("enter restro number And Dish Number ");
                int restroNo=sc.nextInt();
                int dishNo=sc.nextInt();
                u1.placeOrder(rsList.get(restroNo-1),dishNo);
                System.out.println("want to add again type y/n");
                String  fchoise=sc.next();
                if(fchoise.equals("n"))
                {
                    flag=false;
                }
            }
            System.out.println("Do you want  to checkOut type y/n");
            String checkF=sc.next();
            if(checkF.equals("y"))
            {
                System.out.println("Thank for order");
                u1.od.display_TotalOrder();
                System.out.println("This order is by default COD");
                ds.assignDriver(u1.od);
                ds.deliver(u1.od);
            }
        }
        else
        {
            System.out.println("Thank for Loging in");
        }


    }
}