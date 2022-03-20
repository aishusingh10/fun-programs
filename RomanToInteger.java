class Solution {
    public int romanToInt(String s) {
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        
         int value = map.get(s.charAt(0));
        
        //System.out.println(value);
        
         for(int i=1;i<s.length();i++) {
             if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                 //System.out.println(s.charAt(i));
                 value = value + map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
                 //System.out.println(value);
             } else {
                 //System.out.println(s.charAt(i));
                 value = value + map.get(s.charAt(i));
                  //System.out.println(value);
             }
         }
        
        return value;
    }
}