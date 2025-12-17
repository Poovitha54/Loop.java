import java.util.*;

public class Ascending {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ascending=true;
        int prev=10;
        while(n>0) {
            int curr=n%10;
            if (curr>prev){
                ascending=false;
                break;
            }
            prev=curr;
            n/=10;
        }
        System.out.println(ascending);
    }
}
