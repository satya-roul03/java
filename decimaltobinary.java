public class decimaltobinary {
    public static void main(String[]args)
    {
        int i=0,num=8;
        int arr[]=new int[6];
 if(num==0)
        System.out.println("0");
        while(num>0)
        {
              arr[i]=num%2;
              i++;
              num=num/2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.println(arr[j]);
        }
    
    }
    
}
