import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int id;
    private String name;
    private LocalDate bDate;
    public Student(){}
    public Student(int Id, String Name, int Year, int Month, int Day)
    {
        id= Id;
        name= Name;
        bDate= LocalDate.of(Year, Month, Day);
    }
    public int GetAge()
    {
        LocalDate today = LocalDate.now();
        return Period.between(bDate, today).getYears();
    }
    public int GetId()
    {
        return id;
    }
    public String GetName() {return name;}
    public void PrintInfo()
    {
        System.out.println("Id: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Age: " + GetAge());
    }
    @Override public boolean equals(Object x)
    {
        Student y = (Student) x;
        if(this.GetId() != y.GetId()) return false;
        if(this.GetAge() != y.GetAge()) return false;
        if(this.GetName() != y.GetName()) return false;
        return true;
    }
}