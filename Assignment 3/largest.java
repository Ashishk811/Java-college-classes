
public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc=new java.util.Scanner(System.in);
int size;
System.out.println("Enter array size");
size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter array elements");
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
int large=largest(arr);
int slarge=secondLargest(arr);
System.out.println("largest element is"+large);
System.out.println(" second largest element is"+slarge);
	}
	static int largest(int arr[])
	{
		int large=0;5
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
				large=arr[i];
		}
		return large;
	}
static int secondLargest(int arr[])
{
	int large=largest(arr);
	int slarge=0;
	for(int i=0;i<arr.length;i++)
	{
		if((slarge<arr[i]) && (arr[i]!=large))
			slarge=arr[i];
	}
	return slarge;
}
}
