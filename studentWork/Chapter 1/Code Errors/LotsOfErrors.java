public class LotsOfErrors { //fixed class name + moved '{'
    
    public static void main(String[] args) { //added 'void' + '[]'
        System.out.println("Hello, world!"); //added 'out.'
        message();
}
        
    public static void message() { //fixed method call
        System.out.println("This program surely cannot"); //added parentheses
        System.out.println("have any \"errors\" in it"); //used escapables on quotes
    }
}