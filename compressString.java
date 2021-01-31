class Result{
    static String compressString(String str){
        int count=1;
      String cstr="";
      for(int i=0;i<str.length();i++)
        {
          if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
          {
            count++;
          }
        else if(count>1)
        {
          cstr=cstr+str.charAt(i)+String.valueOf(count);
          count=1;
        }
        else if(count==1){
          cstr=cstr+str.charAt(i);
        count=1;}
        }
      str=cstr;
      return str;
    }
}
