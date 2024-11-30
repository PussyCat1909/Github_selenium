package TinhDongGoi;

public class Company {
    public static void main(String[] args) {
//        Student student = new Student("bảo",12,"092828292","Hà Nội");
        Student student = new Student();
        student.setName("Baảo");
        student.setAge(12);
        student.setPhone("0982762627");
        student.setAddress("Hà Nội 2");
        System.out.println(student.getAddress());
    }
}
