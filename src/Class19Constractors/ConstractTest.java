package Class19Constractors;

public class ConstractTest {
    public static void main(String[] args) {
        Constract  constract = new Constract();
        constract.isEmployee =true;
        constract.name="Vlad";
        constract.num=100;
        Constract constract1 =new Constract("Vladik", 101,false);
        System.out.println("Default constractor name " + constract.name + "Default Constractor number " + constract.num +
                "Default Constractor is Employee"  +constract. isEmployee);

    }




}



