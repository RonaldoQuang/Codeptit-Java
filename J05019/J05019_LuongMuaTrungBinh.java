package J05019;

import java.util.*;
import java.text.DecimalFormat;

class Tram {
    private String ma;
    private String ten;
    private double tb;
    public Tram(String ma, String ten, double tb) {
        this.ma = ma;
        this.ten = ten;
        this.tb = tb;
    }
    public void kq() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(ma + " " + ten + " " + df.format(tb));
    }
}

public class J05019_LuongMuaTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, double[]> mp = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine().trim();
            String bd = sc.nextLine().trim();
            String kt = sc.nextLine().trim();
            double lm = Double.parseDouble(sc.nextLine().trim());

            double x = Integer.parseInt(bd.substring(0, 2)) + Integer.parseInt(bd.substring(3)) / 60.0;
            double y = Integer.parseInt(kt.substring(0, 2)) + Integer.parseInt(kt.substring(3)) / 60.0;
            double gio = y - x;

            if (!mp.containsKey(ten)) {
                mp.put(ten, new double[]{gio, lm});
            }
            else {
                double[] val = mp.get(ten);
                val[0] += gio;
                val[1] += lm;
                mp.put(ten, val);
            }
        }

        List<Tram> a = new ArrayList<>();
        int cnt = 1;
        for (Map.Entry<String, double[]> entry : mp.entrySet()) {
            String ma = (cnt < 10) ? "T0" + cnt : "T" + cnt;
            double gio = entry.getValue()[0];
            double mua = entry.getValue()[1];
            double tb = mua / gio;
            Tram t = new Tram(ma, entry.getKey(), tb);
            a.add(t);
            cnt++;
        }
        for (Tram t : a) {
            t.kq();
        }
    }
}

