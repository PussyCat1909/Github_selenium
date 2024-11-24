package TinhKeThua;

public class tinhkethua2 extends tinhkethua{
    public tinhkethua2(java.lang.String companyName, java.lang.String taxCode, java.lang.String Address, int employeeAmount, java.lang.String mmemonicName) {
        super(companyName, taxCode, Address, employeeAmount, mmemonicName);
    }
public void showinfo(){
    System.out.println("Print abc");
    super.showinfo();
}
    public static void main(String[] args) {
        tinhkethua2 kethua2 = new tinhkethua2("ABc","123","dè",123,"hdg");
        kethua2.showinfo();
    }
}
