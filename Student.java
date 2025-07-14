public class Student {
    private String name;
    private int rollNo;

    //Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    //ToString Method
    public String toString(){
        return "Student{name = " + name + ", Roll No. = " + rollNo + "}";
    }
    //Homework Method
    public void homework() {
        System.out.println("Homework done by Student!");
    }

    public static void main (String[] args) {
        //Object created
        Student stud = new Student("Rajat Kumar", 15);

        System.out.println(stud); //To String method called
        
        stud.homework();           //Homework method called
    }

}
