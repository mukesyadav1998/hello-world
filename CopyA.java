class CopyA
{
   public static void main(String args[])
{
     String s="Mukesh Yadav";
      char y[]=s.toCharArray();
      int size=s.length();
      char a[]=new char[size];
      int i=0;
        while(i!=size)
          {   
             a[i]=y[i];
             ++i;
           }
      System.out.println(a);
       System.out.println(y);

}
}
       