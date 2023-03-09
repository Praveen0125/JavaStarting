public class JumpState
{
    public static void main(String[] args)
    {
        for (int i = 0;i<9; i++)
        {
            if (i == 5)
            {
//                break;          breaks the loop after 4
//                continue;       skips the value at 5 and again runs for next
                return;         // similar to break
            }
            System.out.println(i);
        }
    }
}
