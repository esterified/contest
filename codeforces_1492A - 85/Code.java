import java.io.*;
import java.util.*;
public class Code{
    public static void main(String[] args) {
       MyScanner sc = new MyScanner();
       out = new PrintWriter(new BufferedOutputStream(System.out));
       
       // Start writing your solution here. -------------------------------------
    
       /*
       int n      = sc.nextInt();        // read input as integer
       long k     = sc.nextLong();       // read input as long
       double d   = sc.nextDouble();     // read input as double
       String str = sc.next();           // read input as String
       String s   = sc.nextLine();       // read whole line as String
 
       int result = 3*n;
       out.println(result);                    // print via PrintWriter
       */
       //my code     
       long sw_time;
       long t_time;
       long me_time;
       int in_count=sc.nextInt();
  
       for(int i=1;i<=in_count;i++){
        me_time=sc.nextLong();
        long f=0;
       for(int j=0;j<=2;j++){
           
        sw_time=sc.nextLong();  
        
        if (me_time<sw_time) {
            t_time = sw_time-me_time;
           
        }
        else if(me_time>sw_time && me_time%sw_time!=0){
            t_time = sw_time-me_time%sw_time;
            
            
        }
        else{
            t_time=0;

        }
        if(j==0){f=t_time;}
        
        if(t_time<=f){
        f=t_time;
            
        }
        
        //out.println(sw_time[j-1]);
        
       }
       out.println(f);
       //out.println(me_time);
       }
       //
       // Stop writing your solution here. -------------------------------------
       out.close();
    }
 
      
 
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
       
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
       BufferedReader br;
       StringTokenizer st;
  
       public MyScanner() {
          br = new BufferedReader(new InputStreamReader(System.in));
       }
  
       String next() {
           while (st == null || !st.hasMoreElements()) {
               try {
                   st = new StringTokenizer(br.readLine());
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           return st.nextToken();
       }
  
       int nextInt() {
           return Integer.parseInt(next());
       }
  
       long nextLong() {
           
           return Long.parseLong(next());
       }
  
       double nextDouble() {
           return Double.parseDouble(next());
       }
  
       String nextLine(){
           String str = "";
       try {
          str = br.readLine();
       } catch (IOException e) {
          e.printStackTrace();
       }
       return str;
       }
 
    }
    //--------------------------------------------------------
 }
