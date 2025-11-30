package J05054;

import java.util.*;
import java.util.Collections;

class hs{
    private String ma, ten, hl;
    private float diem;
    private int tt;
    public hs(String ma, String ten, float diem){
        this.ma=ma;
        this.ten=ten;
        this.diem=diem;
        if(diem>=9) this.hl="Gioi";
        else if(diem>=7) this.hl="Kha";
        else if(diem>=5) this.hl="Trung Binh";
        else this.hl="Yeu";
    }
    public float getDiem(){
        return this.diem;
    }
    public void kq(){
        System.out.printf("%s %s %.1f %s ",ma,ten,diem,hl);
    }
}

public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Float> lis=new ArrayList<>();
        List<hs> a=new ArrayList<>();
        Map<Float,Integer> mp=new HashMap<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma="";
            if(i<10) ma="HS0"+String.valueOf(i);
            else ma="HS"+String.valueOf(i);
            String ten=sc.nextLine();
            float diem=sc.nextFloat();
            a.add(new hs(ma,ten,diem));
            lis.add(diem);
        }
        int rank=1;
        Collections.sort(lis,Collections.reverseOrder());
        for(int i=0;i<lis.size();i++){
            if(!mp.containsKey(lis.get(i))) {
                mp.put(lis.get(i),rank);
            }
            rank++;
        }
        for(hs x:a){
            x.kq();
            System.out.println(mp.getOrDefault(x.getDiem(),0));
        }
    }
}
