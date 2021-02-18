class Arithemetic
{
 public static void main(String [] args)
  {
     int a =9,b=5,sum,sub,mul,mod;
     float div;
     sum=a+b;
     sub=a-b;
     mul=a*b;
     div=(float)a/b; //type casting -data type conversion
     mod=a%b;
     
      System.out.println("the addition of two numbers "+a+" and "+b+" is"+sum);
      System.out.println("the sub of two numbers is"+sub);
      System.out.println("the mul of two numbers is"+mul);
      System.out.println("the  div of two numbers is"+div);
      System.out.println("the mod of two numbers is"+mod);
}
}