package J08020;

import java.util.*;

public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            Stack<Character> st=new Stack<Character>();
            int ok=1, i=0;
            while(i<s.length()){
                char c=s.charAt(i);
                if(c=='['||c=='('||c=='{'){
                    st.push(c);
                }
                else{
                    if(c==']') {
                        if (!st.empty() && st.peek() == '[') st.pop();
                        else {
                            ok = 0;
                            break;
                        }
                    }
                    if(c==')'){
                        if (!st.empty() && st.peek() == '(') st.pop();
                        else {
                            ok = 0;
                            break;
                        }
                    }
                    if(c=='}'){
                        if (!st.empty() && st.peek() == '{') st.pop();
                        else {
                            ok = 0;
                            break;
                        }
                    }
                }
                ++i;
            }
            if(ok==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
