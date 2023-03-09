public class StringConcat
{
    public static void main(String[] args)
    {
//        String str1 = "String";
//        System.out.println(str1);
//        System.out.println("After concatenating: ");
//        System.out.println(str1.concat(" Concatenation"));
//        System.out.println(str1);
//        String s1 = "Praveen";
//        String s2 = "praveen";
//        System.out.println(s1.compareToIgnoreCase(s2));
//        System.out.println(s1.length());
//        System.out.println(s1.substring(3));
//        System.out.println(s1.substring(3,6));
        StringBuffer s1 =new StringBuffer("Praveen");
        s1.append(" Dubey");
        s1.insert(8,"Okay ");
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.capacity());
    }
}