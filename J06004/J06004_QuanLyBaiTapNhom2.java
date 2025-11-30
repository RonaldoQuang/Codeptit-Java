package J06004;

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

class nhom implements Comparable<nhom>{
    private tv sv;
    private String btl;
    private int stt;
    public nhom(int stt, tv sv, String btl){
        this.stt=stt;
        this.sv=sv;
        this.btl=btl;
    }
    @Override
    public int compareTo(nhom a){
        return this.sv.getMa().compareTo(a.sv.getMa());
    }
    public void kq(){
        System.out.printf("%s %s %s %d %s\n",sv.getMa(),sv.getTen(),sv.getsdt(),stt,btl);
    }
}

public class J06004_QuanLyBaiTapNhom2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        List<tv> a=new ArrayList<>();
        List<nhom> v=new ArrayList<>();
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
            for(tv x:a){
                if(x.getNhom()==i) v.add(new nhom(i,x,bt));
            }
        }
        Collections.sort(v);
        for(nhom x:v) x.kq();
    }
}
