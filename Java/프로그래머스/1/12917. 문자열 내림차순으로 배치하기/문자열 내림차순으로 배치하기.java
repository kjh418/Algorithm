import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        // 문자열을 스트림으로 변환, 정렬하고, 다시 문자열로 변환
        String sortedString = s.chars()
                               .mapToObj(c -> (char) c) // IntStream을 Stream<Character>로 변환
                               .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                               .map(String::valueOf) // Stream<Character>를 Stream<String>으로 변환
                               .collect(Collectors.joining()); // Stream<String>을 합쳐서 하나의 문자열로 변환
        return sortedString;
    }
}