import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        // main loop
        for (int i = 1; i <= n; i++) {
            // First inner loop    Left first triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }  
            // Second inner loop    Left Second triangle
            for(int j =n; j>i ; j--){
                System.out.print("  ");
            }
            // Rectangle
            if(i>2){
            System.out.print("***");}
            else if(i>1){
            System.out.print(" * ");}
            else{
                System.out.print("* *");
            }
            
            for (int j = 0; j < (n-i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            if((n-i)>=2){
                System.out.print("***");}
                else{
                System.out.print("   ");}
            for (int j = 1; j <= i ; j++) {
                System.out.print("  ");
            }
            for(int j=i ;j>n;j--){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
