// A Java program to print "Hello World" 

import java.util.*;

public class MergeTwoArrays {  



	public static void main(String args[]) 
	{ 
      int[] arr1 = {2,5,4,8};
      int[] arr2 = {8,1,3,5,2};
      int m = arr1.length;
      int n = arr2.length;
      int[] arr3 = new int[m+n];
      
      arr1 = sortingMethod(arr1);
      arr2 = sortingMethod(arr2);
      
      int i=0;
      int j=0;
      int k=0;
      
      while(i<m&&j<n) {
      
      if(arr1[i]<arr2[j]){
      arr3[k] = arr1[i];
      k++;
      i++;
      } else {
      arr3[k] = arr2[j];
      k++;
      j++;
      }
      }
      
      if(i<m) {
      
      for(int f=k; f<arr3.length; f++) {
      arr3[f] = arr1[i++];
      }
      }
      
      
      if(j<n) {
      
      for(int f=k; f<arr3.length; f++) {
      arr3[f] = arr1[j++];
      }
      }
      
      
      for(int c: arr3)
      System.out.println(c);
      


       
	} 
	
	public static int[] sortingMethod(int[] arr) {
	
	for(int i=0;i<arr.length;i++) {
	for(int j=i+1; j<arr.length;j++) {
	if(arr[i]>arr[j]){
	int c = arr[i];
	arr[i] = arr[j];
	arr[j] = c;
	}
	}
	}
	
	return arr;
	}
	

}
