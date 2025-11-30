package J05060;

import java.util.*;

class ts{
    private String ma, ten, xl;
    private int tuoi;
    private long diem;
    public ts(String ma, String ten, int tuoi, long diem){
        this.ma=ma;
        this.ten=ten;
        this.tuoi=tuoi;
        this.diem=diem;
        if(diem<5) this.xl="Truot";
        else if(diem<7) this.xl="Trung binh";
        else if(diem==7) this.xl="Kha";
        else if(diem==8) this.xl="Gioi";
        else this.xl="Xuat sac";
    }
    public void kq(){
        System.out.printf("%s %s %d %d %s\n",ma,ten,tuoi,diem,xl);
    }
}

public class J05060_KetQuaXetTuyen {
    public static double thuong(double a, double b){
        if(Math.min(a,b)>=8) return 1.0;
        if(Math.min(a,b)>=7.5) return 0.5;
        return 0.0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<ts> v=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma="PH"+String.format("%02d",i);
            String ten=sc.nextLine();
            int tuoi=2021-Integer.parseInt(sc.next().split("/")[2]);
            double a=sc.nextDouble(), b=sc.nextDouble();
            long diem=Math.min(Math.round((a+b)/2+thuong(a,b)),10);
            v.add(new ts(ma,ten,tuoi,diem));
        }
        for(ts x:v) x.kq();
    }
}
