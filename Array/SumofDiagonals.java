public class SumofDiagonals {
    public static void main(String[] args) {
        int[][] arr ={{12,0,1},{10,8,0},{9,0,30}};
        int sum= 0;

        for(int i=0; i<arr.length; i++){
            //left diagonal
            sum += arr[i][i];
            //right diagonal
            sum += arr[i][arr.length-1-i];
        }

        //Delete the repeatation of the common element (i.e., the middle one) to once
        if (arr.length % 2 !=0){
            sum -= arr[arr.length/2][arr.length/2];
        }

        System.out.println("Sum of diagonal of the matrix is: "+sum);

    }
}
