import java.util.Scanner;
public class DigitsInWords {
   static String word(int d) {
        String[] w = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return w[d];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result="";
        while (n>0){
            result=word(n%10)+" "+result;
            n/=10;
        }
        System.out.println(result);
    }
}
