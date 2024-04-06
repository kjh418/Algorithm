import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int subjectNumber = scanner.nextInt();
        int subjectScore[] = new int[subjectNumber];

        for(int i = 0; i < subjectNumber; i++){
            subjectScore[i] = scanner.nextInt();
        }

        long sum = 0;
        long max = 0;

        for(int i = 0; i < subjectNumber; i++){
            if(subjectScore[i] > max) max = subjectScore[i];
            sum += subjectScore[i];
        }
        
        System.out.println(sum * 100.0 / max / subjectNumber);
    }
}
