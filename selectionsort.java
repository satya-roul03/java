import java.util.*;
class selectionsort
{
    public static void main(String args[])
    {
        //Scanner class declaration for input number
        Scanner in=new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("***                                   ***");
        System.out.println("***      Selection Sort Program       ***");
        System.out.println("***                                   ***");
        System.out.println("*****************************************");
        System.out.print("");
        System.out.println(" ");
        System.out.println("Enter the index of array:");
        int idx=in.nextInt();
        System.out.println(" ");
        System.out.println("*****************************************");
         //array declaration
        int arr[]=new int[idx];
        //array input
        for(int i=0;i<idx;i++)
        {
            System.out.println("Enter "+(i+1)+" index of Array: ");
            arr[i]=in.nextInt();

        }
        System.out.println(" ");
        //selection sort
        for(int i=0;i<idx-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<idx;j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest=j;
                }
            }
            //swap
            int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        }
        System.out.println(" ");
        System.out.println("*****************************************");
        System.out.println("Assending order array is: ");
        System.out.println("*****************************************");
        for(int k=0;k<idx;k++)
        {
            System.out.println(arr[k]);
        }
        System.out.println("*****************************************");
        System.out.println(" ");
    }
}