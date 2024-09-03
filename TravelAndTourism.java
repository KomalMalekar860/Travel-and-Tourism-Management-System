
package travel.and.tourism;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TravelAndTourism {

    static int x,c,pin;
	static Scanner sc=new Scanner(System.in);
	static InputStreamReader ss=new InputStreamReader(System.in);
	static BufferedReader sd=new BufferedReader(ss);
	static SignUp obj1=new SignUp();	static Package pac1=new Package(); static Bus slr1=new Bus(); 
    
    public static void main(String[] args) throws IOException
    {
        do{
            System.out.println("Welcome to Orange travels !!!");
		System.out.println("Please sign up if you are new to website \n If you have already account for our website then sign in to our account");
		do{System.out.println("for sign up please press 1 or for sign in 2");
		c=sc.nextInt();
		if(c==1)
		{
			
			System.out.println("Name: ");
			obj1.name=sd.readLine();
			System.out.println("emailId: ");
			obj1.emailid=sd.readLine();
			System.out.println("phone number: ");
			obj1.phno=sd.readLine();
			System.out.println("Enter pin code for your login code");
			obj1.no=sc.nextInt();
                        obj1.store();
			
			
		}
		else if(c==2)
		{
			SignUp obj2=new SignUp();
			System.out.println("secrete pin ");
			pin=sc.nextInt();
			if(pin==3246)
			{
				System.out.println("Welcome to Admin");
				do{System.out.println("1.see packages\n2.add packages\n3.display Routes\n4.add routes");
				System.out.println("5.exit");	
				System.out.println("Enter the process to be done by corresponding number");
				
				int sa;
				sa=sc.nextInt();
				switch(sa)
				{
				case 1:
					System.out.println("These are the packages");
					pac1.display();
					break;
				case 2:
					System.out.println("u r here to add packages");
					pac1.add();
					break;
				case 3:
					System.out.println("to see landways");
					pac1.displayroutes();
					break;
				case 4:
					pac1.Addroute();
					break;
				
				case 5:
					System.exit(0);
					
				
				}
				}while(true);
			}
			else if(obj1.check(pin)) 
			{
		
		//		System.out.println("you succesfully logined");
				do{System.out.println("1.view packages\n2.select packages\n3.display routes\n4.book tickets for routes\n5.exit");
				int csa;
				csa=sc.nextInt();
				switch(csa)
				{
				case 1:
					System.out.println("These are the packages");
					pac1.display();
					break;
				case 2:
					pac1.bookpackage();
					
					break;
				case 3:
					System.out.println("to see landways");
					pac1.displayroutes();
					break;
				case 4:
					slr1.routes();
					break;
				
				case 5:
                                    System.exit(0);
				//	break;
				
				}}while(true);
			}
			else
			{
				System.out.println("sry");
			}
					}
		if(c!=1 && c!=2)
				{
					System.out.println("please You sould create or login to account");
					
				}
		}while(c!=1 && c!=2);
		}while(true);
	}
    }
    

