class CountPathMaze{
    //Method 1
    public static int mazePaths1(int m, int n) {
        if (m==1 || n==1) return 1;
        
        return mazePaths1(m-1,n)+ mazePaths1(m,n-1);
    }

    //Method 2
    public static int mazePaths2(int i, int j, int m, int n){

        // if (i==n || j==m) return 0;
        // if (i==n-1 && j==m-1) return 1;
        if (i==n-1 || j==m-1) return 1;

        return mazePaths2(i+1, j, m, n)+ mazePaths2(i, j+1, m, n);
    }


    public static void main(String[] args) {
        int totalPaths1= mazePaths1(3, 3);
        System.out.println("By path 1: "+totalPaths1);

        int totalPaths2= mazePaths2(0, 0, 3, 3);
        System.out.println("By path 2: "+totalPaths2);

    }
}