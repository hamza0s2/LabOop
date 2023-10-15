package Spotify;



public class Music
{
    private String title;
    private Artist artist;
    private String genre;
    private double duration;
    private String albumName;
    private Date releaseDate;

    public Music(String title, Artist artist, String genre, double duration, String albumName, Date releaseDate)
    {
        setArtist(artist);
        setDuration(duration);
        setGenre(genre);
        setTitle(title);
        setAlbumName(albumName);
        setReleaseDate(releaseDate);
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Artist getArtist()
    {
        return artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public double getDuration()
    {
        return duration;
    }

    public void setDuration(double duration)
    {
        this.duration = duration;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public void setAlbumName(String albumName)
    {
        this.albumName = albumName;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString()
    {
        String display = String.format("%s\t\t%s\t\t%s\t\t%.1f\t\t%s\t\t%s", title, artist, genre, duration, albumName, releaseDate);
        return display;
    }

    public boolean equals(Object o)
    {
        Music song = (Music) o;
        if(song.getArtist().getName().equals(this.artist.getName()) && song.getTitle().equals(this.title))
        {
            return true;
        }
        else
            return false;
    }
}
