package problems;

public class printeven {

    public static void main(String[] args) {
        for (int i = 5017; i <= 9012; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
