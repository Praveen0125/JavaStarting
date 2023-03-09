public class Array
{
    public static void main(String[] args)
    {
        int []a = {2,4,6,8,10};
        int i = 4;
        System.out.println(a.length);
        System.out.println("The element at "+(i+1)+" i.e, index "+i+" is: "+a[i]);
        int [][] multiDimArr = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
        System.out.println(multiDimArr[0].length);
//        char [] a = {'P','R','A','V','E','E','N'};
//        char b[] = new char[7];
//        System.out.println(a);
//        System.out.println(b);
//        System.arraycopy(a,0,b,0,4);              // Array copying
//        System.out.println(b);
        // Deleting an element from array
//        int flag = 5;
//        for (int i =0;i<a.length;i++)
//        {
//            if(i==flag)
//            {
//                for (int j = i+1;i<a.length-1;j++)
//                {
//                    a[i] = a[j];
//                    i++;
//                }
//                System.out.println(a);
//            }
//        }
    }
}
