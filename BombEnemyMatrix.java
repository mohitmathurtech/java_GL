/**
 * input
 *
 *   XXEX
 *   XBXX
 *   XEXX
 *   XXBX
 */
public class BombEnemyMatrix {
    public static void main(String[] args) {
        String [][] inputArr = {{"X","X","E","X"},
                                {"X","B","X","X"},
                                {"X","E","X","X"},
                                {"X","E","X","X"}};
    }
    public static boolean checkBomb(int[][] arr, int m, int n){
        int[][] bombTest = new int[m][n];
        int[][] enemyTest = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 'B'){

                }
            }
        }
        return true;
    }
}
