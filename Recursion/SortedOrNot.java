class SortedOrNot{
    public static boolean SortedKiNehi(String s1, int index){
        if (s1.charAt(index)>s1.charAt(index+1)) return false;
        if (index==s1.length()-2) return true;
        return SortedKiNehi(s1, index+1);
    }


    public static void main(String[] args) {
        boolean b1= SortedKiNehi("024577789", 0);
        if(b1) System.out.println("Sorted");
        else System.out.println("Not sorted");
    }
}