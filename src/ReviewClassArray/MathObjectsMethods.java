package ReviewClassArray;

public class MathObjectsMethods {
    public void sum(int a , int b){
        int sum =a+b;
        System.out.println(sum);
    }
    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        MathObjectsMethods math = new MathObjectsMethods();
        math.sum(5,10);
        int product =math.multiply(3,4);
        System.out.println(product);

       // System.out.println("sum" + math.sum(3,3));
    }
}
