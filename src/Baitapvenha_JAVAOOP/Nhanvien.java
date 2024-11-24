package Baitapvenha_JAVAOOP;
//- Tạo project mới làm bài tập phần Java OOP
//- Tạo package để phân chia rõ ràng các bài tập cho phù hợp (tuỳ ý)
//- Tạo class NhanVien và các biến, hàm cho phù hợp để lưu lại thông tin nhân viên cơ bản (họ tên, tuổi,...)
//- Tạo class ThongTin để gọi lại thông tin nhân viên từ class NhanVien trên
public class Nhanvien {
    public String name;
    public  int age;
    public String DOB;
    public String Role;

    public Nhanvien(java.lang.String name, int age, java.lang.String DOB, java.lang.String Role) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.Role = Role;
    }

    public void showinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(DOB);
        System.out.println(Role);
    }
}
