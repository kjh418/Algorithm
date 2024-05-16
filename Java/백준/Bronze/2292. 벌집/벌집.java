import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int now = 1;

        while(N > count){
            count += now * 6;
            now++;
        }
        System.out.println(now);
    }
}