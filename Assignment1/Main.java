public class Main {
    public static void main(String[] args)
    {
        UniSystem test= new UniSystem();
        test.AddStudent(11924202, "AAA", 2001, 11, 20); // added
        test.AddStudent(11824202, "BBB  ", 2001, 11, 20); // added
        test.AddStudent(11724202, "CCC", 2001, 11, 20); // added
        test.AddStudent(11924202, "AAA", 2001, 11, 20); // exist

        test.GetStudent(11924202); // print info
        test.GetStudent(1); // doesn't exist

        test.RemoveStudent(11924202); // student removed
        test.GetStudent(11924202); // doesn't exist
        test.RemoveStudent(1); // doesn't exist

        test.GetReport();
        // add op ---> 4 times
        // retrieve op ---> 3 times
        // remove op ---> 2 times
    }
}