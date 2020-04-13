package Q1;
import java.util.*;

public class Q1NonDuplicate {

    private int N;

    public Q1NonDuplicate(int n) {
        N = n;
    }

    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number of non-duplicate integer in between 0 - 100");
        int N = sc.nextInt();
        System.out.println("Generate "+N+" non-duplicate integer within 0-100");
        System.out.println("Linked List Implementation");
        System.out.println(noDup());
        System.out.println("Array Implementation");
    }

    public int[] noDup() {
        Random r = new Random();
        int cnt = 0;
        int[] num = new int[N];
        while (cnt <= N) {
            for (int i = 0; i < N; i++) {
                num[i] = r.nextInt(100);
                for (int j = 0; j < num[i]; j++) {
                    if (num[i] != num[i - j]) {
                        cnt++;
                    }
                }
            }
        }
        return num;
    }
}
