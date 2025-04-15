class MoveEleToEnd{

    public static String tempStr="";
    public static int count=0;
    public static void eleToLast(String s1,int index, char el){

        if (index==s1.length()){
            tempStr += String.valueOf(el).repeat(count);
            System.out.println(tempStr);
            return;
        }

        if(s1.charAt(index)!=el){ 
            tempStr+= s1.charAt(index);
        } else count +=1;

        eleToLast(s1,index+1,el);

    }

    public static void main(String[] args) {
        eleToLast("xxxaxbcxxdx",0,'x');
    }
}