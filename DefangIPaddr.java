class DefangIPaddr {
    public String defangIPaddr(String address) {
        char[] charArr = address.toCharArray();
        String str = "";
       for(char ch: charArr){
           if(ch == '.') {
               str = str + "[.]";
            } else {
               str = str + ch;
           }
       }
        return str;
    }
}