
import java.util.*;
import java.io.*;

public class Test{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                String s1 = in.next();
                String s2 = in.next();
                int s1x=0, s2x=0;
    
                for(int i=0; i<s1.length(); i++) {
                    if(s1.charAt(i) == 'X') {
                        s1x++;
                    }
                }
                for(int i=0; i<s2.length(); i++) {
                    if(s2.charAt(i) == 'X') {
                        s2x++;
                    }
                }
    
                if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)) {
                    if(s1.charAt(s1.length()-1) == 'L') {
                        if(s1x > s2x) System.out.println(">");
                        else if(s1x < s2x) System.out.println("<");
                        else System.out.println("=");
                        
                    }
                    else if(s1.charAt(s1.length()-1) == 'M') {
                        System.out.println("=");                       
                    }
                    else {
                        if(s1x > s2x) System.out.println("<");
                        else if(s1x < s2x) System.out.println(">");
                        else System.out.println("=");
                        
                    }
                }
                else {
                    if(s1.charAt(s1.length()-1) > s2.charAt(s2.length()-1))
                    System.out.println("<");
                    else System.out.println(">");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

                
            
          
    

    



