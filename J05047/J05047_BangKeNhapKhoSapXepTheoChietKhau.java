package J05047;

import java.util.*;
import java.util.Collections;

class mh implements Comparable<mh>{
    private String ma, ten;
    private int ck, tien;
    public mh(String ma, String ten, int sl, int gia){
        this.ma=ma;
        this.ten=ten;
        if(sl>10) this.ck=gia*sl*5/100;
        else if(sl>=8&&sl<=10) this.ck=gia*sl*2/100;
        else if(sl>=5&&sl<8) this.ck=gia*sl/100;
        else this.ck=0;
        this.tien=gia*sl-this.ck;
    }
    @Override
    public int compareTo(mh a){
        return a.ck-this.ck;
    }
    public void kq(){
        System.out.printf("%s %s %d %d\n",ma,ten,ck,tien);
    }
}
public class J05047_BangKeNhapKhoSapXepTheoChietKhau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<mh> a=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        for (int i=0;i<n;i++){
            sc.nextLine();
            String ma;
            String ten=sc.nextLine();
            String[] b=ten.trim().split("\\s+");
            String s=""+Character.toUpperCase(b[0].charAt(0))+Character.toUpperCase(b[1].charAt(0));
            mp.put(s,mp.getOrDefault(s,0)+1);
            if(mp.get(s)<10) ma=s+"0"+mp.get(s);
            else ma=s+String.valueOf(mp.get(s));
            int sl=sc.nextInt();
            int gia=sc.nextInt();
            a.add(new mh(ma,ten,sl,gia));
        }
        Collections.sort(a);
        for(mh x:a){
            x.kq();
        }
    }
}

