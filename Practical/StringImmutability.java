package mypackage;
public class StringImmutability 
{
    public static void main(String[] args) 
    {
        String original = "Rohith ";
        String modified = original.concat("Reddy");
        System.out.println(original);
        System.out.println(modified);
    }
}