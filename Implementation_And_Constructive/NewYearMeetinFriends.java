import java.util.Scanner;

public class NewYearMeetinFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int minDis = Math.min(Math.min(x1, x2), x3);
        int maxDis = Math.max(Math.max(x1, x2), x3);
        int middleDis = 0;
        
        if((x1 < x2 && x2 < x3)|| (x1 > x2 && x2 > x3)){
            middleDis = x2;
        }else if((x2 > x1 && x1 > x3) || (x2 < x1 && x1 < x3)){
            middleDis = x1;
        }else if((x1 > x3 && x3 > x2) || (x1 < x3 && x3 < x2)){
            middleDis = x3;
        }

        int res = maxDis - middleDis; 
        res += middleDis - minDis;

        System.out.println(res);

    }
}
