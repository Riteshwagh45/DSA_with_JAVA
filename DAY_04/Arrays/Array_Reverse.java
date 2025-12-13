public class Array_Reverse{
    public static void Reverse(int a[],int n){
        int start=0;
        int end=n-1;
    
           while(start<end){
              //swap

              int temp =a[start];
                a[start] =a[end];
                a[end] = temp;

               start++;
               end--;
             }
        

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        Reverse(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
