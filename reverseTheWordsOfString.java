class Result {
  static void revWordsString(String str){
	String[] words=str.split(" ");
    String rev="";
    for(int i=0;i<words.length;i++)
    {
      String word=words[i];
      String revW="";
      for(int j=word.length()-1;j>=0;j--)
      {
        revW=revW+word.charAt(j);
      }
      rev=rev+revW;
      if(i!=words.length-1)
        rev=rev+" ";
    }
    System.out.print(rev);
  }
}
