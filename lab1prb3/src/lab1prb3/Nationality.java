package lab1prb3;

public class Nationality
{
    private String country;

    public Nationality(String country)
    {
        this.country = country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry()
    {
        return this.country;
    }

    public String toString()
    {
        return ""+this.country;
    }
}
