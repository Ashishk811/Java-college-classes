class Qs04{
    public static boolean primeNoKiNehi(int num,int n){
        if (num%n==0) return false;
        if (n==num-1) return true;
        return primeNoKiNehi(num, n+1);
    }

    public static void main(String[] args) {
        if(primeNoKiNehi(43,2)) System.out.println("Prime Number");
        else System.out.println("Composite Number");
    }
}