import java.util.Scanner;
public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 3 == 0){
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 3");
        }
    }
}
