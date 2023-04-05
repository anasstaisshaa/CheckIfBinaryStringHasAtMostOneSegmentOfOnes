class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i =0 ; i < s.length()-1; i++){
            if(s.charAt(i) -'0' == 0 && s.charAt(i+1) -'0' == 1)
                return false;
        }
        return  true;
    }
}
