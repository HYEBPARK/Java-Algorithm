class Solution {
    public String solution(String phone_number) {
      String ph1 = new String("");
        for(int i=0; i<phone_number.length(); i++)
            if(phone_number.length()-i<=4) ph1+=phone_number.charAt(i);
            else ph1+="*";


        return ph1;
    }
}
