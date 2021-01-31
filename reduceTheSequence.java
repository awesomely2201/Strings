class Result{
    static String reduceSequence(String str,char ch){
	String str2="";	
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
            if(str.charAt(i+1)!=ch)
            {
              str2=str2+str.charAt(i);
            }
          }
        else
          str2=str2+str.charAt(i);
        }
      str=str2;
      return str;
    }
}
