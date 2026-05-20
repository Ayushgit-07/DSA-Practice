import java.util.*;
public class PatternReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <=temp; j++){
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }
    }
}