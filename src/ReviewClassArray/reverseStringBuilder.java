package ReviewClassArray;

public class reverseStringBuilder {

    public static String reverseString(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        String abc = reverseStringBuilder.reverseString("AbC");
        System.out.println(abc);
    }
}
