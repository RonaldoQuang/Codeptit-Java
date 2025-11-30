package J05064;

import java.util.*;

class nghe{
    private String ma, ten;
    public long bac, pc, luong;
    public nghe(String ma, String ten, long tien){
        this.ma=ma;
        this.ten=ten;
        this.bac=Long.parseLong(ma.substring(2,4));
        if(ma.substring(0,2).equals("HT")) this.pc=2000000;
        else if(ma.substring(0,2).equals("HP")) this.pc=900000;
        else this.pc=500000;
        this.luong=tien*this.bac+this.pc;
    }
    public void kq(){
        System.out.printf("%s %s %d %d %d\n",ma,ten,bac,pc,luong);
    }
}

public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> mp=new HashMap<>();
        List<nghe> a=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0){
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            long tien=sc.nextLong();
            String x=ma.substring(0,2);
            mp.put(x,mp.getOrDefault(x,0)+1);
            if(x.equals("HT")){
                if(mp.get(x)<=1) a.add(new nghe(ma,ten,tien));
            }
            else if(x.equals("HP")){
                if(mp.get(x)<=2) a.add(new nghe(ma,ten,tien));
            }
            else a.add(new nghe(ma,ten,tien));
        }
        for(nghe x:a) x.kq();
    }
}
