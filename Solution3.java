import java.util.Scanner;
class Solution3 {
    public static void main(String[] args) {
        int random = 54;
        int user;
        do {
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        if (user == random) {
        System.out.println("You Win!! You entered correct Number");
        break;
        } else if (user > random) {
        System.out.println("OOPS! You entered greater digit,Try some Small Number");
        } else {
        System.out.println("Think greater digit");
        }
        } while (user!=random);        
    }
}
