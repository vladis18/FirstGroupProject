package classTask;

public class StringFunctions {
    public static void main(String[] args) {
        String str="NewLife";
//        Create a String and if the String is not empty perform the following:
//        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
//        Create a String and print it in reverse order (Sunday → yadnuS).

        if (!str.isEmpty()){
            if(str.length()%2!=0 && str.length()>3){
                System.out.println(str.substring(3,4));
            }
        }
String str2="Sunday";
        for(int i=str2.length()-1;i>=0 ;i--){
            System.out.print (str2.charAt(i));
        }

//    String name = "Burju*Maria*Qasim";
//    String[] array = name.split("[^A-Z a-z]");
//    System.out.println(Arrays.toString(array));
//    String mix = "3213Hello 89 World354545 *&***^&*^&*";
//    System.out.println(mix.replaceAll("[0-9]", ""));
//    System.out.println(mix.replaceAll("[a-z]", ""));
//    System.out.println(mix.replaceAll("[a-z A-Z]", ""));
//    System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
//    System.out.println(mix.replaceAll("\\s+", ""));
//    Create a String that will hold a sentence. Write a program to get a new String without any spaces.
//
//
//
//
//
//            1:15
//    Create a String that should be combination of letters, numbers and special
//    characters. Find out how many alpha characters are there in the String
//1:15
//    You have a String a=”Is it saturday? Is it raining?
//    Do we have a Java Class today?” How would you find out how many sentences are in that String
        String str3="Heve &);123a wonderfull Day";
        System.out.println(str3);
//    for (int i=0;i< str3.length();i++){
//        i//f (str3.charAt(i)
//
//
//    }
    }

}