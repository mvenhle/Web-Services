package lab1prb3;

public class Driver
{
    private static String createPerson(String firstName,
        String lastName, int age, String occupation, String country,
        double salary)
    {
        Name name = new Name(firstName, lastName);
        Age _age = new Age(age);
        Occupation job = new Occupation(occupation);
        Nationality nation = new Nationality(country);
        Income income = new Income(salary);

        return String.format("%-15s %-15s %-15s %-15s %-15s",
                             name, _age, job, nation,income);
    }
        public static void main(String[] args)
    {
        
        String[] people = new String[5];
        people[0] = createPerson("John", "Wick", 35, "Security",
            "U.S.A", 10000);
        people[1] = createPerson("Elon", "Musk", 28, "Receptionist", 
            "Germany", 5000);
        people[2] = createPerson("Tetiana", "Ivasiunko", 29, "Manager", 
            "Ukraine", 600000);
        people[3] = createPerson("Mvenhle", "Shikovha", 19, "Investor",
            "South Africa", 8000000);
        people[4] = createPerson("Julia", "Handzlik", 20, "Doctor", 
            "Poland", 100000);

        
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Name", "Age", "Occupation", "Country",
                "Income"));
        for(int i=0;i<5;i++)
        {
            System.out.println(people[i]);
        }
    }
}