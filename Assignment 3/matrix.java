
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter row and column size");
int r=sc.nextInt();
int c=sc.nextInt();
int arr[][]=new int[r][c];
int arr2[][]=new int[r][c];
input(arr,r,c);
input(arr2,r,c);
System.out.println("Elements of array1 is:");
display(arr,r,c);
System.out.println("Elements of array2 is:");
display(arr2,r,c);
add(arr,arr2,r,c);
System.out.println("Transpose of array1 is:");
transpose(arr,r,c);
System.out.println("Transpose of array1 is:");
transpose(arr2,r,c);
	}
static void input(int arr[][],int r,int c)
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter elements to the array");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
}
static void display(int arr[][],int r,int c)
{
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
static void transpose(int arr[][],int r,int c)
{
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<r;j++)
		{
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
	}
}
static void add(int arr[][],int arr2[][],int r,int c)
{
	int sum[][]=new int[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			sum[i][j]=arr[i][j]+arr2[i][j];
		}
	}
	System.out.println("Addition matrix is");
	display(sum,r,c);
}
}
