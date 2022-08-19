import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Interval {

    public static class Pair {
        int left;
        int right;

        Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        Pair() {
        }

        public int getLeft(){
            return this.left;
        }

        public int getRight(){
            return this.right;
        }

        public void setLeft(int left){
            this.left = left;;
        }

        public void setRight(int right){
            this.right = right;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return this.getLeft() + " : " + this.getRight();
        }
    }

    // Pair (Start, end)

// (1,5) (4,8) (10,14) -> merge the pairs  
// 1 2 3 4 5
//       4 5 6 7 8 -> (1,8), (10,14)
//                   10 11 12 13 14

//                   (1,3) (3,7) (7,10)
//                   1 2 3
//                          5 6 7
//                                8 9 10

// {{1,3},{2,4},{6,8},{9,10}}
    public static void main(String[] args) {

      Pair pair1 = new Pair(6,8);
      Pair pair2 = new Pair(1,9);
      Pair pair3 = new Pair(2,4);
      Pair pair4 = new Pair(4,7);
  
      List<Pair> pairList = new ArrayList<Pair>();
      pairList.add(pair1);
      pairList.add(pair2);
      pairList.add(pair3);
      pairList.add(pair4);

      Comparator<Pair> customComparator = new Comparator<Pair>(){
        @Override
        public int compare(Pair obj1, Pair obj2) {
            if(obj1.getLeft()>obj2.getRight())
            return 1;
            else 
            return -1;
        }
      };

      pairList = pairList.stream().sorted(Comparator.comparingInt(Pair::getLeft)).collect(Collectors.toList());
      
      int index = 0;
      int i=1;
      while(i<pairList.size()) {
        if(pairList.get(index).getRight()>=pairList.get(i).getLeft()) {
            int max = Math.max(pairList.get(index).getRight(),pairList.get(i).getRight());
            pairList.get(index).setRight(max);
            pairList.get(index).setLeft(pairList.get(index).getLeft());
            pairList.remove(i);
            i=index+1;
        } else {
            index++;
            i++;
        }
      }

      for(Pair pair: pairList) {
        System.out.println(pair.getLeft() + " "+ pair.getRight());
      } 

    }

}
