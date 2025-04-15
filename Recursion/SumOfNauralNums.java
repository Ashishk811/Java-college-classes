class SumOfNauralNums {
    
    public static int printNum(int n){
        if (n==5) return 5;
        return n+printNum(n+1);
        //System.out.println("hi"); Un-reachable code
    }

    public static void main(String[] args) {
        //printNum(1);
        // int sum=0;
        // sum += printNum(1);
        int sum=printNum(1);
        System.out.println(sum);
    }
}