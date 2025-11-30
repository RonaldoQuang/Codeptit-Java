package J05058;

import java.util.*;

class ts implements Comparable<ts>{
    private String ma, ten, tt;
    private float tong, ut;
    public ts(String ma, String ten, float ut, float toan, float ly, float hoa, String tt){
        this.ma=ma;
        this.ten=ten;
        this.ut=ut;
        this.tong=toan*2+ly+hoa+ut;
        this.tt=tt;
    }
    @Override
    public int compareTo(ts a){
        if(this.tong!=a.tong) return Float.compare(a.tong,this.tong);
        return this.ma.compareTo(a.ma);
    }
    public void kq(){
        float x=this.ut, y=this.tong;
        if(x*10%10==0&&y*10%10==0) System.out.printf("%s %s %.0f %.0f %s\n",ma,ten,ut,tong,tt);
        else if(x*10%10==0&&y*10%10!=0) System.out.printf("%s %s %.0f %.1f %s\n",ma,ten,ut,tong,tt);
        else if(x*10%10!=0&&y*10%10==0) System.out.printf("%s %s %.1f %.0f %s\n",ma,ten,ut,tong,tt);
        else System.out.printf("%s %s %.1f %.1f %s\n",ma,ten,ut,tong,tt);
    }
}

public class J05058_SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<ts> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String kv= sc.nextLine();
            String ten=sc.nextLine();
            float toan=sc.nextFloat(), ly=sc.nextFloat(), hoa=sc.nextFloat();
            float ut=0f;
            if(kv.substring(2,3).equals("1")) ut=0.5f;
            else if(kv.substring(2,3).equals("2")) ut=1f;
            else if(kv.substring(2,3).equals("3")) ut=2.5f;
            float tong=toan*2+ly+hoa+ut;
            String tt;
            if(tong>=24) tt="TRUNG TUYEN";
            else tt="TRUOT";
            ts x=new ts(kv,ten,ut,toan,ly,hoa,tt);
            a.add(x);
        }
        Collections.sort(a);
        for(ts x:a) x.kq();
    }
}

