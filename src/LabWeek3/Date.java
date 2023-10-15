package LabWeek3;

public class Date
{
    private int date;

    private int month;

    private int year;

    public Date(int date, int month, int year)
    {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public Date(){}

    public int getDate()
    {
        return date;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        String Display = String.format("%d/%d/%d",date,month,year);
        return Display;
    }
    public Date recentMonth(Date d1, Date d2)
    {
        if(d1.getYear()>d2.getYear())
        {
            return d1;
        }
        else if(d1.getMonth()>d2.getMonth())
        {
            return d1;
        }
        else if(d1.getDate()>d2.getDate())
        {
            return d1;
        }
        else return d2;
    }

}

