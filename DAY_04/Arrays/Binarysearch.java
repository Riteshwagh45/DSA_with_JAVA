// binary search algorithm works only sorted array
public class Binarysearch{
public static int binarysearch(int numbers[],int key){
    int start=0;
    int end= numbers.length-1;
    while(start<=end){

        int mid= (start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]>key){// left check and update end .
            end = mid-1;
        }
        else  {
             start= mid+1; // check right update start.

    }
        
}

            return -1;
}

public static void main(String[] args){
    int numbers[]={1,2,3,4,5};
    int key=3;
    int index=binarysearch(numbers, key);
    System.out.println("key is found at index "+index);

}
}
