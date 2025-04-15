class Recursion1 {
    public static void printNum(int n){
        // System.out.println("Extra");
        if (n==1) {
            System.out.println("n=0");
            return;
        }
        System.out.println("Before Recursion: "+n);
        printNum(n-1);
        System.out.println("_________________Middle Recursion: "+n);
        printNum(n-1);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>After Recursion: "+n);
    }
    
    public static void main(String[] args) {
        System.out.println("Simple Recursion");
        printNum(3);
    }
}