/**
 * To check the @D matrix as Binary Matrix
 * ie to check 0 and 1 in the 2D Array
 *
 */

public class CheckBinaryMatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,0,1},
                        {0,0,0},
                        {1,1,1}};
        System.out.println("OUTPUT :" + toCheck( mat , 3,3) );

        if( toCheck( mat , 3,3) ){
            System.out.println("Yes it is a Binary Matrix");
        }
    }
    public static boolean toCheck(int [][] mat , int rows, int col){
        for(int i =0; i< rows; i++){
            for(int j = 0; j< col; j++){
                if( !(mat[i][j] == 0 || mat[i][j] == 1)) {
                    System.out.println("not a Binary Matrix");
                    return false;
                }
            }
        }
        return true;
    }
}
