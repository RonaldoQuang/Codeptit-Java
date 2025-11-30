package J02025;

import java.util.*;

public class J02025_DayConCoTongNguyenTo {
    public static boolean nto(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void kq(ArrayList<Integer> v){
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
    }
    public static void Try(ArrayList<Integer> v, int[] a, int i, int sum){
        if(nto(sum)){
            kq(v);
        }
        for(int j=0;j<i;j++){
            sum+=a[j];
            v.add(a[j]);
            Try(v,a,j,sum);
            sum-=a[j];
            v.remove(v.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            ArrayList<Integer> v=new ArrayList<>();
            for(int i=0;i<n;i++){
                int sum=a[i];
                v.add(a[i]);
                Try(v,a,i,sum);
                v.remove(v.size()-1);
            }
        }
    }
}
