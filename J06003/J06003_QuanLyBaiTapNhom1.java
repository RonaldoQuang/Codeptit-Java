package J06003;

import java.util.*;

class tv{
    private String ma, ten, sdt;
    private int nhom;
    public tv(int nhom, String ma, String ten, String sdt){
        this.nhom=nhom;
        this.ma=ma;
        this.ten=ten;
        this.sdt=sdt;
    }
    public int getNhom(){
        return this.nhom;
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public String getsdt(){
        return this.sdt;
    }
}

class nhom{
    private tv sv;
    private String btl;
    private int stt;
    public nhom(int stt, tv sv, String btl){
        this.stt=stt;
        this.sv=sv;
        this.btl=btl;
    }
    public void kq(){
        System.out.printf("%s %s %s\n",sv.getMa(),sv.getTen(),sv.getsdt());
    }
}

public class J06003_QuanLyBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        List<tv> a=new ArrayList<>();
        Map<Integer,String> mp=new HashMap<>();
        for(int i=1;i<=n;i++){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String sdt=sc.next();
            int nhom=sc.nextInt();
            a.add(new tv(nhom,ma,ten,sdt));
        }
        sc.nextLine();
        for(int i=1;i<=m;i++){
            String bt=sc.nextLine();
            mp.put(i,bt);
        }
        int q=sc.nextInt();
        while(q-->0){
            List<nhom> v=new ArrayList<>();
            int t=sc.nextInt();
            for(tv x:a){
                if(x.getNhom()==t) v.add(new nhom(t,x,mp.get(t)));
            }
            System.out.println("DANH SACH NHOM "+t+":");
            for(nhom x:v) x.kq();
            System.out.println("Bai tap dang ky: "+mp.get(t));
        }
    }
}
