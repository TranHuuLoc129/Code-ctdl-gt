public class Exercise02 {
    
    public static double  ex02(int n){
        if(n==1){
            return 3;
        }

        return Math.pow(2, n) + Math.pow( n ,2) + ex02(n-1);
    }

    
}
