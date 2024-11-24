package TinhKeThua;

public class Student extends Person{
    boolean sex;
    public Student(java.lang.String name, int age, float height,boolean sex) {
        super(name, age, height);
    }


    public static void main(String[] args) {
        Student student = new Student("Hoài",25,1.55f,true);
        student.getInfo();
    }
}
