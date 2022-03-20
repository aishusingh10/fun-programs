class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        final char[] charArr = s.toCharArray();
        int countR = 0;
        int countL = 0;
        int count = 0;
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i]=='R') {
                countR++;
            } else {
                countL++;
            }
            if(countR==countL){
                countR=0;
                countL=0;
                count++;
            }
        }
        return count;
    }
}