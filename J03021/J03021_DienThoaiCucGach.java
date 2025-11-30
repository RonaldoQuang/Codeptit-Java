package J03021;

import java.util.*;

public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Map<Character,Integer> mp=new HashMap<>();
        mp.put('A', 2); mp.put('B', 2); mp.put('C', 2);
        mp.put('D', 3); mp.put('E', 3); mp.put('F', 3);
        mp.put('G', 4); mp.put('H', 4); mp.put('I', 4);
        mp.put('J', 5); mp.put('K', 5); mp.put('L', 5);
        mp.put('M', 6); mp.put('N', 6); mp.put('O', 6);
        mp.put('P', 7); mp.put('Q', 7); mp.put('R', 7); mp.put('S', 7);
        mp.put('T', 8); mp.put('U', 8); mp.put('V', 8);
        mp.put('W', 9); mp.put('X', 9); mp.put('Y', 9); mp.put('Z', 9);
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int ok=1;
            for(int i=0;i<s.length()/2;i++){
                char c=Character.toUpperCase(s.charAt(i));
                char a=Character.toUpperCase(s.charAt(s.length()-1-i));
                if(mp.getOrDefault(c,0)!=mp.getOrDefault(a,0)){
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
