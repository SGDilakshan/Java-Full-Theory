package loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        /*
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=limit);
         */

        int i=2;
        do{
            System.out.println(i);
            i+=2;
        }while(i<=limit);
    }
}
