/**
 * labirint
 */
public class labirint {

    public static void main(String[] args) {
        int M = 10;
        int N = 10;
        int[][] matrix = createArray(M, N);
        fillArray(matrix);

    }
    public static int[][] createArray(int m, int n){
        return new int[m][n];
    }

    // static void fillArray(int[][] arr){
    //     for arr.
    // };

}