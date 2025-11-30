package J08023;

import java.util.*;

public class J08023_HinhChuNhatLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long max1 = Long.MIN_VALUE;
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (st.isEmpty() || a[i] >= a[st.peek()]) {
                    st.push(i);
                } else {
                    while (!st.isEmpty() && a[i] < a[st.peek()]) {
                        int x = st.pop();
                        if (!st.isEmpty()) {
                            max1 = Math.max(max1, (long) (i - st.peek() - 1) * a[x]);
                        } else {
                            max1 = Math.max(max1, (long) i * a[x]);
                        }
                    }
                    st.push(i);
                }
            }
            while (!st.isEmpty()) {
                int x = st.pop();
                if (!st.isEmpty()) {
                    max1 = Math.max(max1, (long) (n - st.peek() - 1) * a[x]);
                } else {
                    max1 = Math.max(max1, (long) n * a[x]);
                }
            }
            System.out.println(max1);
        }
    }
}
