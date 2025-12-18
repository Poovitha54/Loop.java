import java.util.*;
public class AutoNumber{
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        int temp=n;
        boolean auto=true;
        while (temp>0) {
            if (temp%10!=square%10) {
                auto=false;
                break;
            }
            temp/=10;
            square/=10;
        }

        if(auto)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}

