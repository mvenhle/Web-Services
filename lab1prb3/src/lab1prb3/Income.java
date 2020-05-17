package lab1prb3;

public class Income
{
    private double salaryPerAnnum;

    public Income(double salaryPerAnnum)
    {
        this.salaryPerAnnum = salaryPerAnnum;
    }

    public void setSalary(double salaryPerAnnum)
    {
        this.salaryPerAnnum = salaryPerAnnum;
    }

    public double getSalary()
    {
        return this.salaryPerAnnum;
    }

    public String toString()
    {
        String result = "$";
        result += this.salaryPerAnnum;
        return result;
    }
}