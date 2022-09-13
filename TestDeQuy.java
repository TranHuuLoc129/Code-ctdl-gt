import java.util.*;;

public class TestDeQuy {


    public static double  ex02(int n){
        if(n==1){
            return 3;
        }

        return Math.pow(2, n) + Math.pow( n ,2) + ex02(n-1);
    }

    public static double ex(int n){
        return Math.pow(2, n) + Math.pow( n ,2) ;
    }

    public static double khuDeQuy(int n){
        MyStackArr<Integer> a = new MyStackArr<>();
        double kq= 0.0;
        while(n!=0){
            a.push(n);
            n=n-1;
        }

        a.print();

        while(a.empty() == false){
            
            if(a.peek() ==1){
                kq = kq +3;
                a.pop();
            }
            else{
                kq = kq + ex(a.pop());   
            }
             
        }
        return kq;

    }

    public static void reString(String s){
        StackLL<Character> stack = new StackLL<>();

        for(int i =0 ; i<s.length() ; i++ ){
            stack.push(s.charAt(i));
        }

        while(stack.empty() == false){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(ex02(3));

        
        System.out.println(khuDeQuy(3));


        reString("TDT University");

    }
}
