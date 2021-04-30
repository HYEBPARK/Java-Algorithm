class Solution {
    public String solution(String new_id) {
        
       String id = new_id.toLowerCase(); // 1. 소문자 -> 대문자
        String result = id.replaceAll("[^0-9a-z_.-]", ""); //2. 숫자, 영어, '-','_','.' 를 제외하고 다 제거
        id = result.replaceAll("[.]+", "."); // 3. ..이 반복할 경우 . 로 변경
        StringBuilder sb = new StringBuilder(id);

        if (sb.length() > 0 && sb.charAt(0) == '.') sb.deleteCharAt(0); // 4. 처음의 '.' 제거
        if (sb.length() > 2 && sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1); //4. 끝의 '.' 제거
        if (sb.length() == 0) sb.append("aaa"); // 5. 빈문자열은 "aaa"로 변경
        // 6. 문자열의 길이가 16자 이상일 경우 15번째이후로 제거
        if (sb.length() >= 16) { 
            sb.setLength(15);
            if (sb.charAt(14) == '.') sb.deleteCharAt(14); // 제거한 후 마지막 문자가 '.' 경우 제거
        } 
        // 7. 문자열의 길이가 2 이하인 경우 끝문자를 반복하여 3으로 만들어준다. 
        else if (sb.length() < 3) {
            if (sb.length() == 2) sb.append(sb.charAt(sb.length() - 1));
            else {
                sb.append(sb.charAt(sb.length() - 1));
                sb.append(sb.charAt(sb.length() - 1));
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
