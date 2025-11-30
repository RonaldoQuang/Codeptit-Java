package J05024;

import java.util.*;
import java.util.ArrayList;

class sv{
    private String ma, ten, lop, email;
    public sv(String ma, String ten, String lop, String email){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    public String getNganh(){
        return ma.substring(5,7);
    }
    public Character getkitu(){
        return lop.charAt(0);
    }
    public void kq(){
        System.out.printf("%s %s %s %s\n",ma,ten,lop,email);
    }
}

public class J05024_LietKeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> a=new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            a.add(new sv(ma,ten,lop,email));
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String mau=sc.nextLine();
            String w=mau.toUpperCase();
            String[] s=mau.split("\\s+");
            String nganh=""+Character.toUpperCase(s[0].charAt(0))+Character.toUpperCase(s[1].charAt(0));
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",w);
            for(sv x:a){
                if(nganh.equals("CN")||nganh.equals("AT")){
                    if(x.getNganh().equals(nganh)&&x.getkitu()!='E') x.kq();
                }
                else{
                    if(x.getNganh().equals(nganh)) x.kq();
                }
            }
        }
    }
}
