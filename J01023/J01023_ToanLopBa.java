package J01023;

import java.util.*;

public class J01023_ToanLopBa {
    static int cmp(String a, String s) {
        int cnt = 0, dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') cnt++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '?' && s.charAt(i) == a.charAt(i)) dem++;
        }
        if (cnt == s.length() - dem) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine();
            int[] a = new int[90];
            int n = 10, x = 0, ok = 0;
            while (n <= 99) {
                a[x] = n;
                ++x;
                ++n;
            }

            if (s.substring(3, 4).equals("*") || s.substring(3, 4).equals("/")) {
                System.out.println("WRONG PROBLEM!");
            } else {
                for (int i = 0; i < 90; i++) {
                    for (int j = 0; j < 90; j++) {
                        if (a[i] + a[j] <= 99 && a[i] + a[j] >= 10) {
                            int xx = a[i], yy = a[j];
                            String w = xx + " + " + yy + " = " + (xx + yy);
                            if (cmp(w, s) == 1) {
                                System.out.println(w);
                                ok = 1;
                                break;
                            }
                        }
                        if (a[i] - a[j] <= 99 && a[i] - a[j] >= 10) {
                            int xx = a[i], yy = a[j];
                            String w = xx + " - " + yy + " = " + (xx - yy);
                            if (cmp(w, s) == 1) {
                                System.out.println(w);
                                ok = 1;
                                break;
                            }
                        }
                    }
                    if (ok == 1) break;
                }
                if (ok == 0) System.out.println("WRONG PROBLEM!");
            }
        }
    }
}

