import java.util.Scanner;
class Result{
  public static void strtok(String str, String del)
{
  String[] str2=str.split(del);
    for(int i=0;i<str2.length;i++)
    {
      System.out.println(str2[i]);
    }
}
}
class Main{
    public static void main(String[] args)
    {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        String str,del;
        str=sc.next();
        del=sc.next();
        Result.strtok(str,del);
      }
    }
}
