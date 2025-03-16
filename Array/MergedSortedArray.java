public class MergedSortedArray {
    public static void main(String[] args) {
        int[] arr1 ={1,5,9,13,13,17,21,23,24};
        int[] arr2 ={2,3,8,9,13,13,13};
        int[] mergedArr = new int[arr1.length+arr2.length];
        int l1=0;
        int l2=0;

        //logic
        for(int i=0; i< mergedArr.length; i++){
            if(l1==arr1.length || (l2<arr2.length && arr1[l1]>arr2[l2])){
                mergedArr[i] = arr2[l2];
                l2 ++;
        }
            else {
                mergedArr[i] = arr1[l1];
                l1 ++;
            }
        }
        
        //traversing the array
        for(int z=0; z<mergedArr.length; z++){
            System.out.print(mergedArr[z]+" ");
        }
    }
}
