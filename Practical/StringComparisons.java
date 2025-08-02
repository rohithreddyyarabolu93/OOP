package mypackage;
public class StringComparisons 
{
    public static void main(String[] args) 
    {
        String a = "12345";
        String b = "12345";
        String c = new String("12345");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}