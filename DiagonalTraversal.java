public class DiagonalTraversal {

    public static void main(String args[]) {
        int[][] arr = {{00,01,02,03,04,05},{10,11,12,13,14,15},{20,21,22,23,24,25},{30,31,32,33,34,35},{40,41,42,43,44,45},{50,51,52,53,54,55}};

        for(int g=0; g<arr.length; g++) {
            for(int i=0,j=g; j < arr[0].length; i++,j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
