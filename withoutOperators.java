import java.util.Scanner;
public class withoutOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result=0;
        for (int i=0;i<b;i++) {
            result+=a;
        }
          System.out.println("Product="+ result);
}
}
