import java.util.Scanner;
public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        System.out.println("Welcome to Our Library!\n"+"1.Login\n2.New User");
         sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: 
                login();
            case 2:
                newuser();
            default:
                System.out.println("Error");
                
        }
    }
    private static void login(){
        System.out.println("Enter your email address:");
        String email = sc.nextLine();
        System.out.println("Enter Username:");
        String username = sc.nextLine();

    }
    private static void newuser(){
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
       
}
}
