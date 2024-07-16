import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        StringBuilder res = new StringBuilder();
        String s = sc.next();

        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - '0';
            int flipped = 9-num;
            if(i == 0 && flipped == 0){
                res.append(num);
            }else{
                res.append(Math.min(flipped, num));
            }
        }
        System.out.println(res.toString());

    }
}
