class PlacedTiles1xM {
    public static int tilesPlacing(int n, int m){
        if(n==m) return 2;
        if(n<m) return 1;

        return  tilesPlacing(n-m, m)+ tilesPlacing(n-1,m);
    }

    public static void main(String[] args) {
        int count= tilesPlacing(4,2);
        System.out.println(count);
    }
}
