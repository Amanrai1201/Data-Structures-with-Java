public class CountOperationsToObtainZeros {

    public static int CountOperations(int n1, int n2) {
        int count = 0;
        if (n1 == n2) {
            return 1;
        }
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 - n2;
                count++;
            } else {
                n2 = n2 - n1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 2, n2 = 3;
        System.out.println(CountOperations(n1, n2));
    }
}
