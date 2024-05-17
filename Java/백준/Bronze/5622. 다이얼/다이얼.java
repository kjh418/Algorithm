import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();

        int sum = 0;
        for(int i=0; i<text.length; i++){
            char now = text[i];
            if(now == 'A' || now == 'B' || now == 'C'){
                sum += 3;
            }else if(now == 'D' || now == 'E' || now == 'F'){
                sum += 4;
            }else if(now == 'G' || now == 'H' || now == 'I'){
                sum += 5;
            }else if(now == 'J' || now == 'K' || now == 'L'){
                sum += 6;
            }else if(now == 'M' || now == 'N' || now == 'O'){
                sum += 7;
            }else if(now == 'P' || now == 'Q' || now == 'R'|| now == 'S'){
                sum += 8;
            }else if(now == 'T' || now == 'U' || now == 'V'){
                sum += 9;
            }else if(now == 'W' || now == 'X' || now == 'Y' || now == 'Z'){
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}