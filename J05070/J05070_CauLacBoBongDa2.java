package J05070;

import java.util.*;

class part{
    private String ma, ten;
    private int cdv;
    public part(String ma, String ten, int cdv){
        this.ma=ma;
        this.ten=ten;
        this.cdv=cdv;
    }
    public String getMa(){
        return this.ma;
    }
    public String getTen(){
        return this.ten;
    }
    public int getCdv(){
        return this.cdv;
    }
}

class club implements Comparable<club>{
    private part tp;
    private String ma;
    private int tien;
    public club(part tp, String ma, int ve){
        this.tp=tp;
        this.ma=ma;
        this.tien=tp.getCdv()*ve;
    }
    @Override
    public int compareTo(club a){
        if(this.tien!=a.tien) return a.tien-this.tien;
        return this.tp.getTen().compareTo(a.tp.getTen());
    }
    public void kq(){
        System.out.printf("%s %s %d\n",ma,tp.getTen(),tien);
    }
}

public class J05070_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<club> a=new ArrayList<>();
        Map<String, part> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int cdv=sc.nextInt();
            mp.put(ma,new part(ma,ten,cdv));
        }
        int t=sc.nextInt();
        while(t-->0){
            String ma= sc.next();
            int ve=sc.nextInt();
            a.add(new club(mp.get(ma.substring(1,3)),ma,ve));
        }
        Collections.sort(a);
        for(club x:a) x.kq();
    }
}
