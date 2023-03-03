import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 50 && n <= 100) {
            System.out.printf("Число %d міститься в проміжку (50; 100)", n);
        } else {
            System.out.printf("Число %d не міститься в проміжку (50; 100)", n);
        }
    }
}
