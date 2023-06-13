package Submit;
import java.util.*;;
class Main {
    public static void main(String[] args ){
       int x=2,n=5;
       int[] arr = {1,2,3,4,5};
       boolean ans = solve(0, 0, x, n, arr);
       System.out.println(ans);
    }
    static boolean solve(int i, int sum, int x, int n, int[] arr) {
        if(i == n) {
            if(x == sum){
                return true;
            }
            return false;
        }

        if(sum == 0){
           return solve(i+1,sum+arr[i], x, n, arr);
        }
       
        if(solve(i+1,sum+arr[i], x, n, arr)) return true;

        return solve(i+1,sum-arr[i], x, n, arr);
        
        
    }
}
