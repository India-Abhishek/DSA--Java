import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print even numbers");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                System.out.println(i+" ");
            }
        }
        sc.close();
    }
}
