/**
 * Created by todor on 20.09.2017 г..
 */
public class P08_Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <= 8 ; i++) {
            for (int j = i + 1; j <=  9; j++) {
                for (int k = j + 1; k <= 10 ; k++) {
                    System.out.printf("%d %d %d%n", i, j, k);
                }
            }
        }
    }
}
