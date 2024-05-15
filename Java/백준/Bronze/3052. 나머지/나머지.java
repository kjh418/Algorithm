import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //중복을 허용하지 않는 값 (중복이면 무시함)
        Set<Integer> mySet = new HashSet<>();
        for(int i=0; i<10; i++){
            //엔터를 칠 때마다 새로운 수 입력 + 42로 나눈 값의 나머지
            int temp = sc.nextInt() %42;
            mySet.add(temp);
        }
        System.out.println(mySet.size());
    }
}