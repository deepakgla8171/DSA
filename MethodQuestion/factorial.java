package MethodQuestion;

public class factorial {
    static int fact(int n){
     
      for(int i = 1; i<=n; i++){
         fact = fact * i;
        
      }  
       return fact;
    
    }
    public static void main(String[] args) {
         int ans = fact(5);
         System.out.print(ans);

    }
}
