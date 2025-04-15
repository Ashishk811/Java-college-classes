class MobileNums {
    public static String[][] map = { { "." }, {"ABC"},{"DEF"},{"GHI"},{"JKL"},{"MNO"},{"PQRS"},{"TU"},{"VWX"},{"YZ"} };
    
    public static void mobileNumsPossiblities(String s1, int index, String temp){
        
        if (index==s1.length()){
            System.out.println(temp);
            return;
        }
        
        char currChar= s1.charAt(index);
        String mapping= map[currChar-'0'][0];
        
        for (int i=0; i< mapping.length();i++){
            mobileNumsPossiblities(s1, index+1, temp+mapping.charAt(i)); //hit return statement for count= (totals nos. of inside funs) ^ (total iterations of loop or nested loop)
        }

        // mobileNumsPossiblities(s1, index+1, temp,i+1);
        // mobileNumsPossiblities(s1, index, temp+mapping.charAt(i),i+1);


    }
    public static void main(String[] args) {
        // Brute force for where input will only just 2 nos. 
        // for(int i=0; i<map[2][0].length(); i++){
        //     for(int j=0; j<map[3][0].length(); j++){
        //         System.out.print(map[2][0].charAt(i)+""+map[3][0].charAt(j)+" ");
        //     }
        //     System.out.println();
        // }
        mobileNumsPossiblities("32", 0," " );
    }
}