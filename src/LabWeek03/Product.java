package LabWeek03;

public class Product
{
    private int id;
    private String name;
    private double price;
    private int quantity;

    private Date datemanufacture;
    static int counter=1;

    Product(String name, double price, int quantity, Date datemanufacture)
    {
        this.id=counter++;
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setDatemanufacture(datemanufacture);
        ;

    }


    public Date getDatemanufacture() {
        return datemanufacture;
    }

    public void setDatemanufacture(Date datemanufacture) {
        this.datemanufacture = datemanufacture;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getId()
        {
            return id;
        }
     @Override
     public String toString()
    {
        String Display = String.format("%04d\t%-10s%.2f\t%d\t%s",id,name,price,quantity,datemanufacture.toString());
        return Display;
    }

    public Product getrecentMonth(Product p1, Product p2)
    {
        Date latest = datemanufacture.recentMonth(p1.datemanufacture,p2.datemanufacture);
        if (latest == p1.datemanufacture)
            return p1;
        else
            return p2;
    }





}


