class ReverseAstring {
    public static void PrintRev(String s1,int minIndex){

        if (minIndex==s1.length()-1) {
            System.out.println(s1.charAt(minIndex));
            return;
        } 
        PrintRev(s1,minIndex+1);
        System.out.print(s1.charAt(minIndex));
    }
    
    public static void main(String[] args) {
        PrintRev("abcd",0);
    }
}
