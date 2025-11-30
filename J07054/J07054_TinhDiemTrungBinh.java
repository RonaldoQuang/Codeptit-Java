package J07054;

import java.io.File;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class SinhVien {
    private String ma, ten;
    private double diem;

    public SinhVien(String ma, String ten, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
    }

    public void chuanHoa() {
        ten = ten.trim().toLowerCase();
        String[] parts = ten.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : parts) {
            sb.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1))
                    .append(" ");
        }
        ten = sb.toString().trim();
    }

    public double getDiem() {
        return diem;
    }

    public String getMa() {
        return ma;
    }

    public String lamTron() {
        BigDecimal bd = new BigDecimal(diem).setScale(2, RoundingMode.HALF_UP);
        return bd.toString();
    }

    public void inThongTin(int rank) {
        System.out.println(ma + " " + ten + " " + lamTron() + " " + rank);
    }
}

public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> ds = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String ma = (i < 10) ? "SV0" + i : "SV" + i;
            String ten = sc.nextLine();
            double p1 = Double.parseDouble(sc.nextLine());
            double p2 = Double.parseDouble(sc.nextLine());
            double p3 = Double.parseDouble(sc.nextLine());
            double diem = (p1 * 3.0 + p2 * 3.0 + p3 * 2.0) / 8.0;
            ds.add(new SinhVien(ma, ten, diem));
        }

        Collections.sort(ds, (a, b) -> {
            if (Double.compare(b.getDiem(), a.getDiem()) == 0) {
                return a.getMa().compareTo(b.getMa());
            }
            return Double.compare(b.getDiem(), a.getDiem());
        });

        Map<Double, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).chuanHoa();
            int rank;
            if (i == 0) {
                rank = 1;
                rankMap.put(ds.get(i).getDiem(), rank);
            } else {
                if (Double.compare(ds.get(i).getDiem(), ds.get(i - 1).getDiem()) == 0) {
                    rank = rankMap.get(ds.get(i - 1).getDiem());
                } else {
                    rank = i + 1;
                    rankMap.put(ds.get(i).getDiem(), rank);
                }
            }
            ds.get(i).inThongTin(rank);
        }
    }
}


