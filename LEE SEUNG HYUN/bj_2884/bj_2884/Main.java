package bj_2884.bj_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < 45){
            H = H - 1;
            M = 60 - (45 - M);

            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }

        else{
            System.out.println(H + " " + (M-45));
        }

    }
}
