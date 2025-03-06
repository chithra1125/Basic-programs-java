import java.util.*;
import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a=new BigInteger(num1);
       BigInteger b=new BigInteger(num2);
        BigInteger c=a.multiply(b);
 
      return String.valueOf(c);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String num1=scanner.nextLine();
        String num2=scanner.nextLine();
        Solution a=new Solution();
        System.out.println(a.multiply(num1,num2));
    }
}
