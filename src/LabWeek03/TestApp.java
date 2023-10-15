package LabWeek03;

public class TestApp
{
    public static void main(String[] args)
        {
            Date date1 = new Date(2,4,2024);
            Date date2 = new Date(8,3,2023);
            Product p1=new Product("LCD", 50000, 2,date1);
            Product p2=new Product("Mouse", 1000, 10,date2);

            System.out.println(p1);
            System.out.println(p2);

            System.out.println("Recent Product: "+p1.getrecentMonth(p1,p2));




        }
}
