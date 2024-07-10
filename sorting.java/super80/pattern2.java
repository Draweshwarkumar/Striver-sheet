// package super80;

public class pattern2 {
         public static void main(String[] args) {
            int N = 4;
            int width = 4 * N - 3; 
    
            for (int i = 1; i <= N; i++) {
                printLine(N, i, width);
            }
    
            for (int i = N - 1; i >= 1; i--) {
                printLine(N, i, width);
            }
        }
    
        public static void printLine(int N, int line, int width) {
            int numCount = line;
            int spaceCount = 2 * (N - line);
    
           
            for (int i = 0; i < spaceCount; i++) {
                System.out.print("  ");
            }
    
           
            for (int i = 1; i <= numCount; i++) {
                System.out.print(i + " ");
            }
    
           
            for (int i = 0; i < width - 2 * numCount - 2 * spaceCount; i++) {
                System.out.print("  ");
            }
    
           
            if (line > 1) {
                for (int i = numCount; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            }
    
            System.out.println();
        }
    }
