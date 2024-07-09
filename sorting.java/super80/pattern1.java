// package super80;

public class pattern1 {
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }

    public static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N * 2 - 1; j++) {
                if ((i == 1 && (j == 1 || j >= N + 1)) ||
                    (i == 2 && j == 1) ||
                    (i == 3) ||
                    (i == 4 && (j == N + 1 || j == N + 3)) ||
                    (i == 5 && (j == 1 || j == 2 || j == N + 1 || j == N + 3))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
          }
    }

