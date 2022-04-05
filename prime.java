package d2;

public class prime {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int c=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
	
		if(c==0)
		{
			System.out.println("it is a prime");
		}
		else
		{
			System.out.println("it is not a prime");
		}
		
		
		}
	}
