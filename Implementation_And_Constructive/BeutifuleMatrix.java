import java.util.Scanner;

public class BeutifuleMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int i = 0;
        int j = 0;
        int posX = -1;
        int posY = -1;
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if(matrix[i][j] == 1){
                    posX = i;
                    posY = j;
                    break;
                }
            }
            if(posX != -1 && posY != -1){
                break;
            }
        }

        int targetX = 2;
        int targetY = 2;

        int res = Math.abs(Math.abs(targetX-posX)) + (Math.abs(targetY-posY));

        System.out.println(res);

    }
}