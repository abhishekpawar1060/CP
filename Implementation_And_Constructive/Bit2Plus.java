import java.util.Scanner;

public class Bit2Plus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        int x = 0;
        for (int i = 0; i < n; i++) {
            String op = sc.nextLine();
            if(op.equals("++")){
                x++;
            }else if(op.equals("--")){
                x--;
            }  
        }

        System.out.println(x);
    }
    
}