import java.util.Scanner;

public class search_array {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];for(
    int i = 0;i<size;i++)
    {
        numbers[i] = sc.nextInt();
    }

    system.out.println("enter the number to find");
    int find = sc.nextInt();for(
    int j = 0;j<size;j++)
    {
        if (numbers[j] == find) {
            System.out.println(j);
            return;
        }
    }System.out.println("not found");

}
