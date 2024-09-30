import java.util.ArrayList;
public class Database extends LibraryM {
    public static void main(String[] args) {
        LibraryM x = new LibraryM();
        x.Newbook();
        String s = arr;
        ArrayList<String> nametitle = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<Integer>();

        String [] s1 = s.split(" ");
        for (String str : s1) {
            if (str.matches("\\d+")) {
                number.add(Integer.parseInt(str));
            } else {
                nametitle.add(str);
            }
        }

        System.out.println(nametitle);
        System.out.println(number);
    }
    
    
}
