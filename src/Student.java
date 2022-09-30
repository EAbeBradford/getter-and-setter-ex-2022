public class Student {
    private double gpa = 0.0;
    private String name = "hi";
    private String className = "hi";

    public Student()
    {
    String n = "adrg";
    }
    public Student(String n)
    {
        name =n;
    }



    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setClassName(String eli)
    {
        className = eli;
    }
    //int numClasses;

    public void info() {
        System.out.println(name);
    }

    public void info(String a) {
        System.out.println(a);

    }
    public int info(String a, int t) {
        System.out.println(a +t);
        return t;

    }
    public void info(int t, String b) {
        System.out.println(b +t);

    }

    public boolean greater(Student a){
        boolean ans = this.gpa > a.gpa;
        return ans;
    }
}
