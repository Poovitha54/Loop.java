import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();
        int dec=0,pow=1;

        while(bin>0) {
            dec+=(bin%10)*pow;
            pow*=2;
            bin/=10;
        }
        System.out.println(dec);
}
}
