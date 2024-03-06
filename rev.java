import java.io.*;
class rev
{
    public static void main(String args[])throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num,rev=0,temp,rem;
        System.out.println("Enter a number : ");
        num=Integer.parseInt(bf.readLine());
       temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println(temp+" is a reverse number");
        }
        else
        {
            System.out.println(temp+" is not a reverse number");
        }
    }
}