public class user {
    private String name;

    public user(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public order od=new order(this);
    public void placeOrder(restro rs,int No)
    {
        od.addOrder(rs,No);
    }
}
