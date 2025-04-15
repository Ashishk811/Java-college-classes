class FirstLastOccurance{
    public static void elementOcc(String s1, int minIndex, char ele, int maxIndex){

        if (s1.charAt(minIndex)==ele) {
            if (s1.charAt(maxIndex)==ele) {
                System.out.println("1st occurance at index: "+minIndex);
                System.out.println("Last occurance at index: "+maxIndex);
                return;
            }
            // elementOcc(s1, minIndex,ele,maxIndex-1);
            // return;
        }
        

        if (minIndex==s1.length()-1){
            System.out.println("No element Found");
             return;
        }
        elementOcc(s1, minIndex+1,ele,maxIndex-1);
    }

    public static void main(String[] args) {
        String s1="abaacdaefaakkhaa";
        char elemtent='a';
        elementOcc(s1, 0,elemtent,s1.length()-1);
    }
}