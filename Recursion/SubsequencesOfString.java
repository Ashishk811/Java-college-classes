import java.util.HashSet;
class SubsequencesOfString{

    public static void subsOfStrings(String s1, int index, String temp, HashSet<String> set){
        if (index==s1.length()){
            // if (set.contains(temp)){
            // }
            // else{
            //     System.out.println(temp);
            //     set.add(temp);
            // }
            System.out.println(temp);
            return;
        }
        
        // for (int i=0; i<2;i++){
        subsOfStrings(s1, index+1, temp+"_", set);
        subsOfStrings(s1, index+1, temp+s1.charAt(index),set);
        // }
        
        
    }

    public static void main(String[] args) {
        HashSet<String> newSet=new  HashSet<>();
        subsOfStrings("ab", 0, "", newSet);
    }
}