public class dish {
    private String name;
    private int price;
    dish(String  name,int  price)
    {
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
