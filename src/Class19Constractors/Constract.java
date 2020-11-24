package Class19Constractors;

public class Constract {
//    Write a program that will have a constructor:
//    one with parameters and second without any parameters.
//    Create a separate Test class where you will execute both of the constructors 1 by 1.
//    Write a java program of Class Students that takes students name and 3 subject grades.
//    Inside your class also have a method to Calculate Average Grade.
//    Test Student class for 5 different students with different marks.
//    Your program should print an average mark of each students name.
//            NOTE: please use different names for instance and local variables.
//            1:06
//    Write a program  that will have 4 different access levels
//    of constructors and create 3 objects of this class: 1 -
//    inside same class; 2 - from outside the class; 3 -
//    from different class inside different package  and observe result.
//    Write program that have static constructor and observe result.
      String name;
      int num;
      boolean isEmployee;

      Constract(String sName,int iNum, boolean bEmployee){

          System.out.println("Employee Name is " + sName + " Employee number is " + iNum +isEmployee);
      }


    public Constract() {
          name=name;
          num=num;
          isEmployee=isEmployee;
        System.out.println("Default constractor name " + name + "Default Constractor number " + num +
                "Default Constractor is Employee"  + isEmployee);
    }
}
