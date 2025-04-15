class Qs01 {
    public static void main(String[] args) {
        double[] arr = arrayInputs();
        double maxValue = largestNo(arr);
        System.out.println("Max Value is: " + maxValue);
    }

    public static double largestNo(double[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double[] arrayInputs() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Size of Array: ");
        int size = sc.nextInt();
        double arr[] = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + " : ");
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

}