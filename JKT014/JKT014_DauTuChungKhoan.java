package JKT014;

import java.util.*;

public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n+1], b=new int[n];
            for(int i=1;i<=n;i++) a[i]=sc.nextInt();
            Stack<Integer> st=new Stack<>();
            for(int i=1;i<=n;i++){
                while(!st.empty()&&a[i]>=a[st.peek()]){
                    st.pop();
                }
                if(st.empty()) System.out.print(i+" ");
                else System.out.print(i-st.peek()+" ");
                st.push(i);
            }
            System.out.println();
        }
    }
}
