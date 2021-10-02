public class Convert_1D_Array_Into_2D_Array {
    public static int[][] construct2DArray(int[] original, int m, int n){
        int length = original.length;
        if(length != m * n) return new int[0][0];

        int[][] res = new int[m][n];
        for(int i = 0; i < length; i++) {
            res[i/n][i%n] = original[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] original_test = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int m_test = 2;
        int n_test = 4;
        int[][] result_test = construct2DArray(original_test, m_test, n_test);
        System.out.println(result_test);
    }
}
