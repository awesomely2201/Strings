static int isAnagram(String a, String b) 
{
  // Complete the function
  int acount=0,bcount=0;
  if(a.length()!=b.length())
    return 0;
  else
  {
    for(int i=0;i<a.length();i++)
    {
      acount=0;
      bcount=0;
      for(int j=0;j<a.length();j++)
      {
        if(a.charAt(i)==a.charAt(j))
          acount++;
        if(a.charAt(i)==b.charAt(j))
          bcount++;
      }
      if(acount!=bcount)
        return 0;
    }
    return 1;
  }
}
