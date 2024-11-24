package Phamvitruyvap_public;

public class demoPublic {
    public String name ="selenium";
    public int version = 5;
    public void showinfo(){
        System.out.println(name);
        System.out.println(version);
    }

    public static void main(String[] args) {
        demoPublic Demopublic = new demoPublic();
        Demopublic.showinfo();
    }
}
