public class Reverse {


    public static void main(String[] args) {
        String input = "aishwarya";
        StringBuilder sb = new StringBuilder(input);

        System.out.println(sb.reverse());

        StringBuilder sb1 = new StringBuilder();

        int len = input.length();
        for(int i=len-1; i>=0;i--) {

            sb1.append(input.charAt(i));

        }

        System.out.println(sb1.toString());
    }




    
}
