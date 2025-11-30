package J05009;

import java.util.*;
import java.text.DecimalFormat;

class ts{
    private int ma;
    private String ten, dob;
    private float d1, d2, d3, tong;
    public ts(int ma, String ten, String dob, float d1, float d2, float d3) {
        this.ma=ma;
        this.ten=ten;
        this.dob = dob;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.tong=d1+d2+d3;
    }
    public float getDiem(){
        return this.tong;
    }
    public void kq(){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("%d %s %s %s\n", ma, ten, dob, df.format(tong));
    }
}

public class J05009_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<ts> a=new ArrayList<>();
        float max1=-1f;
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            String dob=sc.nextLine();
            float d1=sc.nextFloat();
            float d2=sc.nextFloat();
            float d3=sc.nextFloat();
            max1=Math.max(max1,d1+d2+d3);
            ts x=new ts(i,ten,dob,d1,d2,d3);
            a.add(x);
        }
        for(ts x:a){
            if(x.getDiem()==max1) x.kq();
        }
    }
}
