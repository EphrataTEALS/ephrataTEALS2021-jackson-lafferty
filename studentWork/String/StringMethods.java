package studentWork.String;

public class StringMethods {
    public static void main(String[] args) {
        String book = "Building Java Programs";
        
        int start = book.indexOf(" ") + 1;
        System.out.println(start);

        String test = book.substring(start, 13);
        System.out.println(test);
        
        String startJava = book.substring(start);
        System.out.println(startJava);
        
        int end = startJava.indexOf(" ");
        System.out.println(startJava.substring(end + 1));
    }
}
