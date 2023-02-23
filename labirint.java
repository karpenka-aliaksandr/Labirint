/**
 * labirint
 */
public class labirint {

    public static void main(String[] args) {
        int M = 10;
        int N = 10;
        int[][] testArray = new int[3][3];
        printArray(testArray);
    }

    public static void printArray(int[][] array) {
        for (int[] line : array){
            for (int item: line){
                System.out.printf("%d", item);
            }
            System.out.println();
        }
    }
}