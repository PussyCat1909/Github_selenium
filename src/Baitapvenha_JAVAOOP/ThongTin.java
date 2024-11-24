package Baitapvenha_JAVAOOP;

public class ThongTin extends Nhanvien{
    public ThongTin(java.lang.String name, int age, java.lang.String DOB, java.lang.String Role) {
        super(name, age, DOB, Role);
    }

    public static void main(String[] args) {
        ThongTin thongTin = new ThongTin("Tùng",30,"1/1/1994","Ca sĩ");
        thongTin.showinfo();
    }
}
