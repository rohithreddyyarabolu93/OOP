package mypackage;
public class StringBuilders {
    public static void main(String[] args)     {
        StringBuilder sb = new StringBuilder("Builder ");
        sb.append("Java");
        System.out.println("StringBuilder: " + sb);
        StringBuffer sf = new StringBuffer("Buffer ");
        sf.append("Java");
        System.out.println("StringBuffer: " + sf);
    }
}