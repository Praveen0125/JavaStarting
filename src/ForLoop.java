public class ForLoop
{
    public static void main(String[] args)
    {
//        for (int i =1;i<=10;i++)
//        {
//            System.out.println("19*"+i+"="+19*i);
//        }
        int[] arr = new int[5];  // ways to declare array
        int[] intArr = {1,2,3,4,5,6,7};     // ways to declare array without new int[]
        int arr2[] = {1,2,3};                // array can also be declared like this

        for (int i :                        // for each loop
                intArr) {
            System.out.println(i);
        }
    }
}
