
package triangle;
import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
