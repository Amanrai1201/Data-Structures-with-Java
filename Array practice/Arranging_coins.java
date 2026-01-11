// brute force solution
public class Arranging_coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(50));
    }
    public static int arrangeCoins(int n) {
        int i = 1;
        while(n>=i){
           n =  n - i;
           if(n<=i){
            return i;
           }
           i++;
        }
        return i ;
    }
}

// binary solution 
class Solution {
    public int arrangeCoins(int n) {
        int l = 0 , h = n;
        while(l <= h) {
            long mid = l + (h - l) / 2;
            if (n >= (mid * (mid + 1) / 2)) l = (int)mid + 1;
            else h = (int)mid - 1;
        }
        return l - 1;
    }
}