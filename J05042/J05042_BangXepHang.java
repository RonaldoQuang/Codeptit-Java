package J05042;

import java.util.*;

class sv implements Comparable<sv>{
    private String ten;
    private int dung, nop;
    public sv(String ten, int dung, int nop){
        this.ten=ten;
        this.dung=dung;
        this.nop=nop;
    }
    @Override
    public int compareTo(sv a){
        if(this.dung!=a.dung) return a.dung-this.dung;
        if(this.nop!=a.nop) return this.nop-a.nop;
        return this.ten.compareTo(a.ten);
    }
    public void kq(){
        System.out.printf("%s %d %d\n",ten,dung,nop);
    }
}

public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<sv> a=new ArrayList<>();
        while(n-->0){
            sc.nextLine();
            String ten=sc.nextLine();
            int dung=sc.nextInt(), nop=sc.nextInt();
            a.add(new sv(ten,dung,nop));
        }
        Collections.sort(a);
        for(sv x:a) x.kq();
    }
}
