import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextInt()로 받아도 되지만 reverse를 해주기 위해 char형으로 받음
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        // SWAP
        char temp = A[0];
        A[0] = A[2];
        A[2] = temp;

        temp = B[0];
        B[0] = B[2];
        B[2] = temp;

        int reA = Integer.parseInt(new String(A));
        int reB = Integer.parseInt(new String(B));

        System.out.println(Math.max(reA, reB));
    }
}