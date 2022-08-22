import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Sayi gir : ");
        Scanner inp = new Scanner(System.in);
        int i, n= inp.nextInt();

        for (i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int t=n; t>=1; t--){
            for(int y=n-t; y>=1; y--){
                System.out.print(" ");
            }
            for (int z=2*t-1; z>=1; z--) System.out.print("*");
            System.out.println();
        }

    }
}