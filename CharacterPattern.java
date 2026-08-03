import java.util.*;

// Prints Character Pattern
public class CharacterPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        char chars = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(chars);
                chars++;
            }
            System.out.println();
        }

    }
}

