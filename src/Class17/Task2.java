package Class17;

public class Task2 {
    //what's a prime number // devisible b7 itself and 1;
    boolean isPrime(int number){
        boolean isPrime=true;
        if (number<=1){
            isPrime=false;
        }
        for (int i =2;i<number/2;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

}
