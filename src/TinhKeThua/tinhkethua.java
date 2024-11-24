package TinhKeThua;

public class tinhkethua {
public  String companyName ;
public String taxCode;
public  String Address;
public  int employeeAmount;
public String mmemonicName;

    public tinhkethua(String companyName, String taxCode,String Address, int employeeAmount,String mmemonicName) {
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.Address = Address;
        this.employeeAmount = employeeAmount;
        this.mmemonicName = mmemonicName;
    }
    public void showinfo(){
        System.out.println(companyName);
        System.out.println(taxCode);
        System.out.println(Address);
        System.out.println(employeeAmount);
        System.out.println(mmemonicName);
    }
}
