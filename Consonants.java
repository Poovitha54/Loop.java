public class Consonants  {
    public static void main(String[] args) {
        System.out.print("Vowels: ");
        for(char c='a'; c<='z';c++){
            if("aeiou".indexOf(c)!=-1)
                System.out.print(c+" ");
        }

        System.out.print("\nConsonants: ");
        for(char c='a';c<='z';c++){
            if("aeiou".indexOf(c)==-1)
                System.out.print(c+" ");
}
    }
}
