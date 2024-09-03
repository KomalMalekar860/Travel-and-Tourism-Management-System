/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.and.tourism;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author 18mis7023
 */
public class Payment {
        static InputStreamReader pp=new InputStreamReader(System.in);
	static BufferedReader pd=new BufferedReader(pp);
     public static int card(int amt) throws IOException
     {
         String cardno="";
 //    int a[]=new int[16];
 do{
     System.out.println("Enter your card number :");
      Scanner read=new Scanner(System.in);
      cardno=pd.readLine();
 }while(check(cardno,16));
  /*    for(int i=0;i<16;i++)
      {
         a[i]=read.nextInt();
       }*/
       if(cardno.charAt(12)==4&&cardno.charAt(13)==2 && cardno.charAt(14)==9 && cardno.charAt(15)==6)
       {
          System.out.println("VISA");
          int h=p(amt);
         return h; 
       }
        else if(cardno.charAt(12)==3 && cardno.charAt(13)==5 && cardno.charAt(14)==4 && cardno.charAt(15)==4)
        {
          System.out.println("MASTERO");
          int h=p(amt);
           return h;
        }
        else
        {
          System.out.println("RUPAY");
          int h=p(amt);
          return h;   
        }
         
   }
    public static int p(double amt) throws IOException
   {
       String ca;
 int i =5,card[]={1111,7563,8464,4543},cvv[]={143,431,767,424},pin[]={3246,4314,9968,5777},pi,cv,bal[]={574566,263443,143243,10000};
             Scanner read=new Scanner(System.in);
             do{
                 do{
                     System.out.println("Enter the Number of your Card :");
             ca=pd.readLine();
                 }while(check(ca,16));
             if(ca.charAt(12)=='1' && ca.charAt(13)=='1' &&ca.charAt(14)=='1' && ca.charAt(15)=='1' )
             {
                 i=0;
             }
             else if(ca.charAt(12)=='7' && ca.charAt(13)=='5' &&ca.charAt(14)=='6' && ca.charAt(15)=='3')
             {
                 i=1;
             }
             else if(ca.charAt(12)=='8' && ca.charAt(13)=='4' &&ca.charAt(14)=='6' && ca.charAt(15)=='4')
             {
                 i=2;
             }
             else if(ca.charAt(12)=='4' && ca.charAt(13)=='5' &&ca.charAt(14)=='4' && ca.charAt(15)=='3')
             {
                 i=3;
             }
             else
             {
                 System.out.println("invalid card number");
             }}while(check(ca,16));
            
                      if(i>=0 && i<=3)
                     {
                          System.out.println("Match Found ");
                          System.out.println("Enter Your CVV Three Digited Number :");
                         cv=read.nextInt();
                        if(cvv[i]==cv)
                        {
                                System.out.println("Match Found ");
                                System.out.println("Enter Your Pin Number :");
                                pi=read.nextInt();
                                     if(pin[i]==pi)
                                    {
                                         System.out.println("Match Found ");
                                        if(bal[i]>=amt)
                                       {
                                                System.out.println("Transcation Sucessful");
                                                System.out.println("Thank You \nVisit Again"); 
                                                return(1);
                                                 
                                       }
                                       else 
                                       {
                                             System.out.println("Insufficient Balance ");

                                       }

                                    }
                                    else
                                    {
                                            System.out.println("Incorrect Pin");
                                            

                                    }        
                            
                            }
                         else
                         {
                                System.out.println("Incorrect CVV");

                         }


                        }
               
		return(0);
	}
    public static boolean check(String str,int n)
    {
        System.out.println(str.length());
        if(str.length()==n)
        {
            
          for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)>='0' && str.charAt(i)<='9')
             {
                 if(i==str.length()-1)
                 {
                     return false;
                 }
              }
              else
               {
                   System.out.println("You entered invalid number\nplease find it");
                   
                   return true;
               
               }
        }
      // return false;
        }
        else
        {
            System.out.println("Please enter correct card number");
            return true;
        }
        return false;
    }

   

    
}
