class Qs01{
    public static void printBtn2nos(int start,int end){
        if (start==end){
            return;
        }
        System.out.print(start+" ");
        printBtn2nos(start+1, end);
    }

    public static void main(String[] args) {
        int start=0;
        int end=10;
        printBtn2nos(start+1, end);
    }
}