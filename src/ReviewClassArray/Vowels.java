package ReviewClassArray;

public class Vowels {
    public static String  VowelsOnly(String name){

        return name.replaceAll("[^AEIOUaeiou]" ," ");
    }

    public static void main(String[] args) {
        //Vowels vowels=new Vowels();
       // String vow =vowels.VowelsOnly("Hello Students how are you?");
          VowelsOnly("Hello Students how are you?");
        System.out.println( VowelsOnly("Hello Students how are you?"));
    }
}
