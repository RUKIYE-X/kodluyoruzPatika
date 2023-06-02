public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3,1},
                {4,7,5,9},
                {9,4,6,6}
        };

        for(int i = 0;i<matris[0].length;i++){
            for(int j = 0;j < matris.length;j++){
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }
    }
}