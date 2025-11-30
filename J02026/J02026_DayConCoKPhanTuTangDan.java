package J02026;

import java.util.*;

public class J02026_DayConCoKPhanTuTangDan {
    public static void kq(ArrayList<Integer> v){
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
    }
    public static void Try(ArrayList<Integer> v, int[] a, int i, int n, int k){
        for(int j=i+1;j<n;j++){
            v.add(a[j]);
            if(v.size()==k){
                kq(v);
            }
            else Try(v,a,j,n,k);
            v.remove(v.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            ArrayList<Integer> v=new ArrayList<>();
            for(int i=0;i<n;i++){
                v.add(a[i]);
                Try(v,a,i,n,k);
                v.remove(v.size()-1);
            }
        }
    }
}
