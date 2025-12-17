import java.util.*;
public class SmallestDigit {
  public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int min=0;
        while(n>0) {
            min=Math.max(min,n%10);
            n/=10;
        }
        System.out.println(min);
    }
}