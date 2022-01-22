import java.util.Scanner
public class Leapyear {
    public static void main(String[] args) {
        // Take a year from user and display leapyear or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int y = sc.nextInt();
        m = y%4;
        if (m==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}