import java.util.Scanner;
public class Decending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean decending=true;
        int prev=-1;
        while(n>0) {
            int curr=n%10;
            if (curr>prev){
                decending=false;
                break;
            }
            prev=curr;
            n/=10;
        }
        System.out.println(decending);
}
}
