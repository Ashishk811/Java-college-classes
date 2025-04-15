class RemoveDuplicates{
    public static boolean[] map= new boolean[26];
    public static void removingdupli(String s1, int index, String strWithoutDupli, String duplis){
        if (index==s1.length()){
            System.out.println("String without duplicates: "+strWithoutDupli);
            System.out.println("Duplicate elements are: "+ duplis);
            return;
        }

        //String after removing duplicates
        if (map[s1.charAt(index)-'a'] != true){
            strWithoutDupli += s1.charAt(index);
            map[s1.charAt(index)-'a'] = true;
        }
        else{
        //only duplicates presesent in string
            duplis+=s1.charAt(index);
        }
        
        removingdupli(s1, index+1, strWithoutDupli, duplis);

    }


    public static void main(String[] args) {
        removingdupli("abbcdcdae", 0, "","");
    }
}