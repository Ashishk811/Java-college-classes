class Qs02{
    public static int revNum=0;
    public static int reverseAnumber(int num){
        if (num>0){
            revNum= revNum*10+num%10;
            reverseAnumber(num/10);
        }
        return revNum;
    }
    
    public static void main(String[] args) {
        //Using While Loop
        int num=1234;
        int temp=0;
        while (num>0){
            temp= temp*10 + num%10;
            num= num/10;
        }
        System.out.println("By while loop: "+temp);

        //Using Recursive Method
        int num1=1234;
        int rev= reverseAnumber(num1);
        System.out.println("By Recursion: "+ rev);
    }
}