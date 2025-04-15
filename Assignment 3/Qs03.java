class Qs03 {
    public static void main(String[] args) {
        int[][] arr1 = array2Dinputs();
        int[][] arr2 = array2Dinputs();
        int[][] addedArr = additionOfMatrix(arr1, arr2);
        traverseAndPrint(addedArr);
    }

    public static int[][] additionOfMatrix(int[][] arr1, int[][] arr2) {
        int[][] newArr = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                newArr[i][j] = arr1[i][j] + arr2[i][2];
            }
        }
        return newArr;
    }

    public static void traverseAndPrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] array2Dinputs() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Size of x-axis: ");
        int x = sc.nextInt();
        System.out.print("Size of y-axis: ");
        int y = sc.nextInt();
        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("For x: " + i + " and y: " + j + " is: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
