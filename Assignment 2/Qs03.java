class Qs03{
    public static int factorial(int num){
        if (num==0){
            return 1;
        }
        else if (num==1){
            return 1;
        }

        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        int fact= factorial(5);
        System.out.println(fact);
    }
}