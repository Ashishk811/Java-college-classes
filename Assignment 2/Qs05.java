class Qs05{
    public static int fibonnacci(int num){
        if (num==1) return 0;
        if (num==2) return 1;

        return fibonnacci(num-1)+fibonnacci(num-2);
    }

    public static void main(String[] args) {
        int till=7;
        for (int i = 1; i <= till; i++) {
            System.out.print(fibonnacci(i)+ " ");
        }
    }
}