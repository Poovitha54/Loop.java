import java.util.Scanner;
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String bin="";

        while(n>0){
            bin=(n%2) + bin;
            n/=2;
        }
        System.out.println(bin);
}
}
