import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10,first=n,digits=0;
        while(first>=10) {
            first/=10;
            digits++;
        }
       int swapped=last*(int)Math.pow(10,digits)+(n%(int)Math.pow(10, digits)) / 10 * 10+ first;
        System.out.println(swapped);
    }
}
