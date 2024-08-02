import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxHeightPostion = -1;
        int maxVal = 0; 
        int minHeightPostion = -1;
        int minVal = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(maxVal < a){
                maxVal = a;
                maxHeightPostion = i+1;
            }

            if(minVal >= a){
                minVal = a;
                minHeightPostion = i+1;
            }
        }


        int res = maxHeightPostion + (n - 1 - minHeightPostion);
        if(maxHeightPostion > minHeightPostion){
            res--;
        }
        System.out.println(res);
    }
}
