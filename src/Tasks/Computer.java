package Tasks;

import java.awt.peer.CanvasPeer;

public class Computer{
    public  void OperatingSystem(){
        System.out.println("Windows");
    }
    public void memory(){
        System.out.println("128 GB");
    }

    public static void main(String[] args) {
        Computer pc = new Apple();
        pc.OperatingSystem();
        Apple apl =   new  Apple  ();
        Computer mac = new Apple();
        mac.OperatingSystem();

        apl = (Apple) new Computer();
        apl.OperatingSystem();
        apl.memory();




    }
}
