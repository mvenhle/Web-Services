package lab1prb3;

public class Name
{
    private String first;
    private String last;
	
    public Name (String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    }

    public void setName(String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    }

    public String getName()
    {
        return first + " " + last;
    }

    public String toString()
    {
        return first + " " + last;
    }
}