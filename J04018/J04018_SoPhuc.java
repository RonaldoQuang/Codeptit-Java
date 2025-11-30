package J04018;

import java.util.*;

class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc first(SoPhuc a) {
        int thucMoi = (this.thuc + a.thuc) * this.thuc - (this.ao + a.ao) * this.ao;
        int aoMoi = this.thuc * (this.ao + a.ao) + (this.thuc + a.thuc) * this.ao;
        return new SoPhuc(thucMoi, aoMoi);
    }

    public SoPhuc second(SoPhuc a) {
        int thucMoi = (this.thuc + a.thuc) * (this.thuc + a.thuc) - (this.ao + a.ao) * (this.ao + a.ao);
        int aoMoi = 2 * (this.thuc + a.thuc) * (this.ao + a.ao);
        return new SoPhuc(thucMoi, aoMoi);
    }

    @Override
    public String toString() {
        if (ao < 0) {
            return thuc + " - " + Math.abs(ao) + "i";
        } else {
            return thuc + " + " + ao + "i";
        }
    }
}

public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            SoPhuc A = new SoPhuc(a, b);
            SoPhuc B = new SoPhuc(c, d);

            SoPhuc C = A.first(B);
            SoPhuc D = A.second(B);

            System.out.println(C.toString() + ", " + D.toString());
        }
    }
}
