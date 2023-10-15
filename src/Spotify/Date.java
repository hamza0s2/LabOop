package Spotify;

public class Date
{
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year)
    {
        setDate(date);
        setMonth(month);
        setYear(year);
    }

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
}
