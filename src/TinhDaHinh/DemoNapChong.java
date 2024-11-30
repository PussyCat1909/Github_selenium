package TinhDaHinh;

public class DemoNapChong {
    public  int tinhTong(int a,int b){
        return  a + b;
    }
    public  int tinhTong(int a, int b,int c){
        return  a + b + c;
    }

    public static void main(String[] args) {
        DemoNapChong demoNapChong = new DemoNapChong();
        System.out.println(demoNapChong.tinhTong(10,20));
        System.out.println(demoNapChong.tinhTong(10,20,50));
    }
}
