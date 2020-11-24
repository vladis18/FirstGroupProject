package Class17;

public class Main {
    public static void main(String[] args) {
        TaskEmail task1 = new TaskEmail();
        String email=task1.createEmail("vlad","babayan","Gmail");
        System.out.println(email);
        Task2 task2 = new Task2();
        boolean prime = task2.isPrime(25);
        boolean prime1 = task2.isPrime(1);
        boolean prime2 = task2.isPrime(10);
        boolean prime3 = task2.isPrime(11);
        System.out.println(prime);
    }
}
