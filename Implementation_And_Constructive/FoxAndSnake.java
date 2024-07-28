import java.util.Arrays;
import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Character[][] mat = new Character[n][m];

        for(Character[] ch : mat){
            Arrays.fill(ch, '.');
        }
        boolean flag = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i % 2 == 0){
                    mat[i][j] = '#';
                }
                else if(i % 2 == 1 && j == m-1 && flag == false){
                    mat[i][j] = '#';
                    flag = true;
                    break;
                }

                else if(i % 2 == 1 && j == 0 && flag == true){
                    mat[i][j] = '#';
                    flag = false;
                    break;
                }
                else{
                    mat[i][j] = '.';
                }
                
            }
        }
        
        

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();   
        }
    }
}
