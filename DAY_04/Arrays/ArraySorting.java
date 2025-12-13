
import java.util.*;
public class ArraySorting{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a length of Array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter Elements In Array:");
    for (int i =0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
   // for(int arrSort :arr ){
     // System.out.print(arrSort + " ");
 //   }
 for (int i =0; i<n;i++){
      System.out.print(arr[i]+" ");
    }
    
  }
}
