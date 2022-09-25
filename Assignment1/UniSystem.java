import java.util.ArrayList;
import java.util.List;

public class UniSystem {

    static private int numberOfAddOP;
    static private int numberOfRetrieveOP;
    static private int numberOfARemoveOP;
    private List<Student> students;

    public UniSystem()
    {
        numberOfAddOP= 0;
        numberOfRetrieveOP= 0;
        numberOfARemoveOP= 0;
        students= new ArrayList<>();
    }
    public void AddStudent(int Id, String Name, int Year, int Month, int Day)
    {
        numberOfAddOP++;
        boolean Exist= false;
        int i= 0;
        while(!Exist && i < students.size())
        {
            if(students.get(i).GetId() == Id) Exist = true;
            else i++;
        }
        if (Exist) System.out.println("Student Already exist.");
        else
        {
            Student student = new Student(Id, Name, Year, Month, Day);
            students.add(student);
            System.out.println("Student Added.");
        }
    }
    public void RemoveStudent(int Id)
    {
        numberOfARemoveOP++;
        boolean Exist = false;
        int i= 0;
        while(!Exist && i < students.size())
        {
            if(students.get(i).GetId() == Id) Exist = true;
            else i++;
        }
        if(Exist)
        {
            students.remove(i);
            System.out.println("Student removed.");
        }
        else System.out.println("Student Doesn't exist.");
    }
    public void GetStudent(int Id)
    {
        numberOfRetrieveOP++;
        boolean Exist = false;
        int i= 0;
        while(!Exist && i < students.size())
        {
            if(students.get(i).GetId() == Id) Exist = true;
            else i++;
        }
        if(Exist) students.get(i).PrintInfo();
        else System.out.println("Student Doesn't exist.");
    }
    public void GetReport()
    {
        System.out.println("Number of Add operations made in system: " + numberOfAddOP);
        System.out.println("Number of Retrieve operations made in system: " + numberOfRetrieveOP);
        System.out.println("Number of Remove operations made in system: " + numberOfARemoveOP);
    }
}
