package J05082;

import java.util.*;

class kh implements Comparable<kh>{
    private String ma, ten, gt, dc, dob;
    private int d, m, y;
    public kh(String ma, String ten, String gt, String dc, String dob){
        this.ma=ma;
        this.ten=ten;
        this.gt=gt;
        this.dc=dc;
        this.dob=dob;
        String[] a=dob.split("/");
        this.d=Integer.parseInt(a[0]);
        this.m=Integer.parseInt(a[1]);
        this.y=Integer.parseInt(a[2]);
    }
    public void chuanhoa(){
        String s="";
        String[] a=this.ten.trim().split("\\s+");
        for(int i=0;i<a.length;i++){
            s+=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[i].length()).toLowerCase()+" ";
        }
        this.ten=s;
    }
    public void chuanhoaDob() {
        String[] a = dob.trim().split("/");
        String d=a[0];
        String m=a[1];
        String y=a[2];
        if(d.length()==1) d="0"+d;
        if(m.length()==1) m="0"+m;
        this.dob=d+"/"+m+"/"+y;
    }
    @Override
    public int compareTo(kh a){
        if(this.y!=a.y) return this.y-a.y;
        if(this.m!=a.m) return this.m-a.m;
        return this.d-a.d;
    }
    public void kq(){
        System.out.printf("%s %s%s %s %s\n",ma,ten,gt,dc,dob);
    }
}

public class J05082_DanhSachKhachHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<kh> a=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String ma="KH"+String.format("%03d",i);
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String dob=sc.nextLine();
            String dc=sc.nextLine();
            a.add(new kh(ma,ten,gt,dc,dob));
        }
        Collections.sort(a);
        for(kh x:a){
            x.chuanhoa();
            x.chuanhoaDob();
            x.kq();
        }
    }
}