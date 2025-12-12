import java.util.*;
public class check_palindrome{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number ");
     int n = sc.nextInt();
     int temp=n;
     int remainder=0;
     int reverse=0;
     // check condtion number is greater than zero 
     while(n>0){
        remainder= n%10; // store last digit of the number in remainder variable
        reverse= (reverse*10)+remainder;  // Add the remainder into reverse
        n=n/10;   // remove the last digit of a number

     }
       if(temp == reverse){  // check number palindrome or not
        System.out.println("Number is palindrome " + temp);

       }
       else{
        System.out.println("Not palindrome " + temp);
       }

    }
}
