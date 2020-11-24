package Class17;

import sun.plugin.javascript.navig.ImageArray;

public class Task3 {
    char getGrade(int marks){

        char grade;
        if(marks>=90&& marks<=100){
            grade='A';

        }else if(marks>=80&&marks<=90){
            grade='B';
        }
        else if (marks>=70&& marks<=80){
            grade='C';
        }
        else  if(marks>=60&&marks<=70){
            grade='D';
        }
        else   {
            grade='F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println("Your grade is " + task3.getGrade(90));
        System.out.println("Your grade is " + task3.getGrade(80));
        System.out.println("Your grade is " + task3.getGrade(70));
    }
}
