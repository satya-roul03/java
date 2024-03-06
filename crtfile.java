import java.util.Scanner;
import java.io.*;
class crtfile
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Choice");
        System.out.println("If u create a file prass 1 and obsence of 1 u  delete a file");
        int n=in.nextInt();
        System.out.println("Enter file name: ");
        String file=in.next();
        File f= new File(file);
        if(n==1)
        {
        f.mkdir();
        System.out.println("The file is created");
        }
        else
        {
           f.delete();
            System.out.println("The file is deleted");
        }
    }
}  