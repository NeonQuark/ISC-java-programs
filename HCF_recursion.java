/*** To calculate the HCF of a number using recursion in java
 Let n1 and n2 be two numbers whose HCF is to be calculated ***/

import java.util.*;
class hcf_rec
{
    int hcf = 0;
    int larger_number = 0;
    public int numb(int j,int n1 , int n2)
    {
        larger_number = Math.max(n1,n2);
              
        if(j==larger_number)
        return hcf;
        else
        {
            if(n2%j==0&&n1%j==0)
               hcf = j;
            return numb(j+1, n1, n2);
            
            
            
            
        }
       }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int k1 = sc.nextInt();
        System.out.println("Second number?");
        int k2= sc.nextInt();
        hcf_rec r = new hcf_rec();
        System.out.println("The HCF of the given two numbers are is: "+r.numb(2 , k1 ,k2 ));
    }
}