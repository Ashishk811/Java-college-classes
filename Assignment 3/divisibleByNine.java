
public class divisibleByNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
divisible(n);
	}
	static void divisible(int n)
	{
		int sum=0,d=0;
		int temp=n;
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			System.out.println(d);
			n=n/10;
		}
		if(sum%9==0)
			System.out.println(temp+" is divisible by 9");
		else
			System.out.println(temp+" is not divisible by 9");
	}

}
