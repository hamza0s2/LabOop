package LabWeek3;

public class Artist
{
    private String name;
    private String nationality;
    private double rating;

    public Artist (String name, String nationality, double rating)
    {
        setName(name);
        setNationality(nationality);
        setRating(rating);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getNationality()
    {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public Double getRating()
    {
        return rating;
    }

    public void setRating(Double rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        String display = String.format("%s\t%s\t%.1f",name,nationality,rating);
        return display;
    }
}
