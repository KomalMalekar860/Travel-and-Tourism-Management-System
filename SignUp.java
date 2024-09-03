/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.and.tourism;

/**
 *
 * @author 18mis7023
 */
public class SignUp {
    static String name="",emailid="";
	static int i=5,no=0;
	static String phno="",namearr[]=new String[40];
	static String emailId[]=new String[40];
	static String phoneno[]=new String[40];
	static int a[]=new int[40];
	/*public static void main(String[] args)
	{
		namearr[0]="Hemanth";namearr[1]="venky";namearr[2]="akash";namearr[3]="dinesh";namearr[4]="priya";
		emailId[0]="18mis7023@gmail.com";emailId[1]="18mis7176@gmail.com";emailId[2]="18mis7208@gmail.com";emailId[3]="18mis7186@gmail.com";emailId[4]="18mis7061@gmail.com";
		phoneno[0]="1234567891";phoneno[1]="1234567892";phoneno[2]="1234567893";phoneno[3]="1234567894";phoneno[4]="1234567895";
        a[0]=3246;a[1]=7176;a[2]=7208;a[3]=7185;a[4]=7061;
    
   
	}*/
	public static void store()
	{
		
		namearr[i]=name;
		emailId[i]=emailid;
		phoneno[i]=phno;
		a[i]=no;
//		System.out.println(namearr[i]);
		i++;
	//	System.out.println(i);
	}
	public static boolean check(int pin)
	{
		namearr[0]="Hemanth";namearr[1]="venky";namearr[2]="akash";namearr[3]="dinesh";namearr[4]="priya";
		emailId[0]="18mis7023@gmail.com";emailId[1]="18mis7176@gmail.com";emailId[2]="18mis7208@gmail.com";emailId[3]="18mis7186@gmail.com";emailId[4]="18mis7061@gmail.com";
		phoneno[0]="1234567891";phoneno[1]="1234567892";phoneno[2]="1234567893";phoneno[3]="1234567894";phoneno[4]="1234567895";
        a[0]=3246;a[1]=7176;a[2]=7208;a[3]=7185;a[4]=7061;
     //   System.out.println(pin);
		for(int j=0;j<=i;j++)
		{
			if(a[j]==pin)
			{
				System.out.println("You succesfully logined");
				return true;
			}
                       
		}
		return false;
	}
	public static void display()
	{
		namearr[0]="Hemanth";namearr[1]="venky";namearr[2]="akash";namearr[3]="dinesh";namearr[4]="priya";
		emailId[0]="18mis7023@gmail.com";emailId[1]="18mis7176@gmail.com";emailId[2]="18mis7208@gmail.com";emailId[3]="18mis7186@gmail.com";emailId[4]="18mis7061@gmail.com";
		phoneno[0]="1234567891";phoneno[1]="1234567892";phoneno[2]="1234567893";phoneno[3]="1234567894";phoneno[4]="1234567895";
        a[0]=3246;a[1]=7176;a[2]=7208;a[3]=7185;a[4]=7061;
        
		for(int p=0;p<i;p++)
		{
		System.out.println(emailId[p]);
		System.out.println(namearr[p]);
		System.out.println(phoneno[p]);
		System.out.println(a[p]);
		}
	}
    
}
