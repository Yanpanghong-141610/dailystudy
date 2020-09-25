package Shujujiegou;
import java.util.Random;
public class Delete {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 5};

        for (int i = 0; i < 7; i++) {
            System.out.println("数组a中的元素为：" + a[i]);
        }
        int n = 0;
        int i = 0;
        for (int j = i + 1; j < 7; j++) {
            int k = j + 1;
            int c = j;
            if (a[i] == a[j]) {
                while (k < 7) {
                    a[c++] = a[k++];
                }
                n++;
            }
        }
        for (int b=0;b<n;b++){
            System.out.println(a[b]);
        }
    }
}


