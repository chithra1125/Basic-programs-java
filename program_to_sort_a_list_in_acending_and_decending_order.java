import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer>al=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=scanner.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            al.add(scanner.nextInt());
        }
        System.out.println("print the ascending order:");
       Collections.sort(al);
       System.out.println(al);
       System.out.println("print in the decending order:");
       Collections.reverse(al);
       System.out.println(al);
    }
}
