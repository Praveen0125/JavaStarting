public class DataTypeConv
{
    public static void main(String[] args)
    {
        int i = 10;
        byte b = 5;
        short s = 8;
        long l = 50l;
        float f = 45f;
        double d = 60.5d;
        boolean bool = true;
        String str = "Praveen";
//        System.out.println(i+" "+b+" "+s+" "+l+" "+f+" "+d+" "+bool+" "+str);
        double db = i;      // implicit type coversion if from small to big
        int it = (int)d;    // explicit typr conversion
        String s1 = d+str;  // double d is implicitly converted into string
//        System.out.println(s1);
        String s2 = "23";
        int i1 = Integer.parseInt(s2);  // or Integer.valueOf() to conert int to string
//        to convert string to int we use Integer.toString()  or String.valueOf
        System.out.println(i1);

    }
}
