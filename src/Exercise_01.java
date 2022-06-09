import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input start:  ");
        int numStart = scan.nextInt();
        System.out.print("Input end: ");
        int numEnd = scan.nextInt();
        for(int i = numStart; i <= numEnd ;i ++){
            System.out.printf("%s%d"," ",i);
        }
    }
}
