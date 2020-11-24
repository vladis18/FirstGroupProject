package replIT2;

public class MethodSpaceOut {
    static String spaceOut2(String str2) {
        //String joe = "Joe";
        String str;
        StringBuilder sb = new StringBuilder();

        for (char c : str2.toCharArray()) {
            sb.append(c).append(" ");
        }
        str=sb.toString();
return str;


    }


    static String spaceOut(String str){
       // String newStr;
         str.replaceAll(".(?!$)","$0");
        return str;

    }
    public static String censorLetter(String str,char chr){
        String newStr;//="";
        String str2 = Character.toString(chr);
       newStr= str.replaceAll( str2,"*");


        return newStr;

    }
    public static void main(String[] args) {
    //
        System.out.println(spaceOut2("Hello"));
        String str="Hello";
        str.replaceAll("l","*");
        System.out.println( str.replaceAll("l","*") );
        str=  str.replaceAll("l","*");
        System.out.println(str);
        System.out.println(censorLetter("AbraKadabra",'a'));
        String c = "Hello i love java";
        boolean var;
        var = c.startsWith("hello");
        System.out.println(var);
        String obj = "I LIKE JAVA";
        System.out.println(obj.charAt(3));
        String strq = "0123456789";
        System.out.println(strq.substring(4));
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.println(replace);

        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
//        String str3=spaceOut("Hello");
//        System.out.println(spaceOut(str3));
//        System.out.println("Hello".replaceAll(".(?!$)", "$0 "));
    }


}
