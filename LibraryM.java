import java.util.Scanner;
public class Library {
    String title;
    String author;
    int isbn;
    boolean available;

    public Book (String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

}
public class Library {
    public Newbook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add new book?(enter the number)  1.Yes   2.No");
        int x = sc.nextInt();
        if(x==1){
            Scanner ob1 = new Scanner(System.in);
            System.out.println("Enter Book title");
            String name = ob1.nextLine();
            Scanner ob2 = new Scanner(System.in);
            System.out.println("Enter book's author");
            String auth = ob2.nextLine();
            Scanner ob3 = new Scanner(System.in);
            System.out.println("Enter book's isbn");
            int number = ob3.nextInt();
        } 
        else{
            
        }
    }
}
