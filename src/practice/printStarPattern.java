import java.util.Scanner;

public class printStarPattern {
    static void printPattern(int n){
        for(int i = 0 ; i <= n;i++){
            for(int j = 0 ; j<=n;j++){
                if (i <= n / 2) {
                    if (i == j || j + i <= 2 * i || i + j >= n) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else {
                    if (i == j || i + j <= n || j - i > 0) {
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
//             0123456789
//            0*        *0
//            1**      **1
//            2***    ***2
//            3****  ****3
//            4**********4
//            5**********5
//            6****  ****6
//            7***    ***7
//            8**      **8
//            9*        *9
//             0123456789
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n for n*n pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);


    }
}
