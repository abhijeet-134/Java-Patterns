import java.util.*;

// Prints 0 and 1
public class zero_one_traingle {
    public static void traingle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                }else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        traingle(n);
    }
}
