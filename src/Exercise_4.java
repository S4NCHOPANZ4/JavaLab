import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many integers will be added?: ");
        int integrers = scan.nextInt();
        int added = 0;
        int i = 0;
        while(i < integrers){
            System.out.print("Enter an integer: ");
            int num = scan.nextInt();
            added = added+num;
            i++;
        }
        System.out.printf("The sum is %d",added);
    }
}
