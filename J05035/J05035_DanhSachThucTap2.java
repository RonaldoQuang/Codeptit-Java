package J05035;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class sv implements Comparable<sv>{
    private int ma;
    private String msv, ten, lop, mail, dn;
    public sv(int ma, String msv, String ten, String lop, String mail, String dn){
        this.ma=ma;
        this.msv=msv;
        this.ten=ten;
        this.lop=lop;
        this.mail=mail;
        this.dn=dn;
    }
    public String getDn(){
        return dn;
    }
    @Override
    public int compareTo(sv a){
        return this.msv.compareTo(a.msv);
    }
    public void kq(){
        System.out.printf("%d %s %s %s %s %s\n",ma,msv,ten,lop,mail,dn);
    }
}

public class J05035_DanhSachThucTap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> a=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String msv=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            String dn=sc.nextLine();
            a.add(new sv(i,msv,ten,lop,mail,dn));
        }
        Collections.sort(a);
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String mau=sc.nextLine();
            for(sv x:a){
                if(x.getDn().equals(mau)) x.kq();
            }
        }
    }
}

