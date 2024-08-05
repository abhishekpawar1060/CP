import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s.length() == 1){
            System.out.println("NO");
            return;
        }

        int fourCount = 0;
        int sevenCount = 0;
        for(char ch : s.toCharArray()){
            if(ch == '4'){
                fourCount++;
            }else if(ch == '7'){
                sevenCount++;
            }
        }

        int luckyCount = fourCount + sevenCount;
        String luckyCountStr = String.valueOf(luckyCount);

        boolean isLucky = true;
        for (char ch : luckyCountStr.toCharArray()) {
            if (ch != '4' && ch != '7') {
                isLucky = false;
                break;
            }
        }

        if (isLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}
