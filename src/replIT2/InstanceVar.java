package replIT2;

public class InstanceVar {
    int year;
    String schoolName;
    int batchN;
    static int count ;

       InstanceVar(){
           count++;
    }




    public static void main(String [] args){

//        InstanceVar obj = new InstanceVar() ;
//        obj.year=202;
//        obj.schoolName="Syntax";
//        obj.batchN=6;

        InstanceVar obj1 = new InstanceVar();
        InstanceVar obj2 = new InstanceVar();
        InstanceVar obj3 = new InstanceVar();
        System.out.println(count);
        //System.out.println("I am a student of " + obj.batchN + " stydying at " + obj.schoolName + " in the year of " + obj.year);
    }

}