package d2;
import java.util.*;
import java.lang.Math;

public class armstrong {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=371;
		int sum=0;
		int r;
		int temp=n;
		while(n!=0){    
			   r = n%10;  //getting remainder  
			   sum=(int) (sum+Math.pow(r, 3)) ;  
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("armsrtong number ");    
			  else    
			   System.out.println("not armstrong");    
			}  

		}