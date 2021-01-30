void reverseString (char str[])
{
  int temp;
  int j=strlen(str)-1;
   for(int i=0;i<strlen(str);i++)
   {
     if(i<strlen(str)/2)
     {
       temp=str[i];
       str[i]=str[j];
       str[j]=temp;
       j--;
     }
   }
}
