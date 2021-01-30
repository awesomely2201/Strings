int countWords(char str[]) 
{
  int count=0;
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ' || str[i+1]=='\0')
    {
      if(str[i]==' ' && str[i-1]!=' ')
        count++;
      else if(str[i+1]=='\0')
        count++;
    }
  }
  return count;
}
