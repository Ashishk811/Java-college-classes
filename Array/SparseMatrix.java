class SparseMatrix{
    public static void main(String[] args) {
        int[][] arr ={{0,0,1,0,9},{10,0,0,2,5},{0,0,0,23,41}};
        int[] row= new int[7]; //total no of elemets in arr - occurance of 0
        int[] col= new int[7];
        int[] value=new int[7];
        int a=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] != 0){
                    row[a]= i;
                    col[a]= j;
                    value[a]= arr[i][j];
                    a++;
                }
            }
        }
        System.out.println("Row"+ "\t" + "Col"+ "\t" + "value");
        for(int z=0; z<row.length; z++){
            System.out.println(row[z]+ "\t" + col[z]+ "\t" + value[z]);
        }
    }
}