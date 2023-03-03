import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int old_level = 1;
        int new_level;
        while (true) {
            System.out.println("Вкажіть поверх: ");
            new_level = scan.nextInt();
                if (old_level > new_level) {
                    if (new_level == 2) {
                        System.out.println("Ви спустилися на 1 поверх!");
                        old_level = 1;
                        continue;
                    } else {
                        System.out.printf("Ви спустилися на %d поверх!\n", new_level);
                    }
                } else if (new_level > old_level) {
                    if (new_level == 2) {
                        System.out.println("Ви піднялися на 3 поверх!");
                        old_level = 3;
                        continue;
                    } else {
                        System.out.printf("Ви піднялися на %d поверх!\n", new_level);
                    }
                }
            old_level = new_level;
        }
    }
}
