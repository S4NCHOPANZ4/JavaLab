import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.next();
        for(int i = 0;i<=word.length();i++){
            System.out.printf("%s ",word);
        }
    }
}
