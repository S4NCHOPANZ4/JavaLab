import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scan.nextInt();
        int a = 0;
        for(int i = 0; i<= num; i++){
            a = a + i;
        }
        System.out.printf("The sum of 1 to %d is %d",num,a);


    }
}
