import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x == 1){
                flag = true;
            }
        }
        if(flag){
            System.out.println("HARD");

        }else{
            System.out.println("EASY");
        }
    }   
}
