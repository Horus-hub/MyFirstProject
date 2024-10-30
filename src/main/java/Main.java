import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("egiazaran_branch");

        int num = new Scanner(System.in).nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = num; j >= 1; j--){
                if (i * j == num) {
                    System.out.println(i + " * " + j);
                }
            }
        }
    }
}
