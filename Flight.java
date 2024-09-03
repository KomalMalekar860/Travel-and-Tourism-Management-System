/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.and.tourism;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author 18mis7023
 */
public class Flight {
     static int x,ns;
	 
	 static int f1[]=new int[60];
	 static int f2[]=new int[60];
	 static int f3[]=new int[60];
	 static int f4[]=new int[60];
	 static int f5[]=new int[60];
 	 static int f6[]=new int[60];
 	// static int f7[]=new int[60];
 	// static int f8[]=new int[60];
 	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		routes();
	}
	public static void routes() throws IOException
	{
		for(int i=0;i<60;i++)
		{
			f1[i]=1;f2[i]=1;f3[i]=1;f4[i]=1;f5[i]=1;f6[i]=1;		
		}
		for(int i=0;i<60;i+=7)
		{
			f1[i]=0;f2[i]=0;f3[i]=0;f4[i]=0;
		
		}
		System.out.println("Welcome to online flight booking");
		do{
			System.out.println("1.hyderbad\n2.bangarole\n3.goa\n4.ooty");
			x=sc.nextInt();       // for storing package number
			switch(x)
			{
				case 1:
					System.out.println("You selected Route is \n	1.hyderbad");
					System.out.println("which type of class do u want \n\t 1.first class \n\t 2.Business class ");
					System.out.println("you selected the first class ");
					seats(f1);
					System.out.println("How many seats do u want");
					int ns;
					ns=sc.nextInt();
					System.out.println("which seats do u want");
					for(int i=0;i<ns;i++)
					{
						int cs;
						cs=sc.nextInt();
						for(int g=0;g<=40;g++)
							{
								if(f1[cs-1]==0)
								{
									System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
									cs=sc.nextInt();
									g=0;
								}
							}
// here we have to create linked list for printing tickets								
									f1[cs-1]=0;
					}
								System.out.println();
							//	seats(ac1);
							break;

				case 2:
					System.out.println("You selected Route is \n	1.Bengarole");
					System.out.println("which type of class do u want \n\t 1.first class \n\t 2.Business class ");
					System.out.println("you selected the first class ");
					seats(f2);
					System.out.println("How many seats do u want");
				//	int ns;
					ns=sc.nextInt();
					System.out.println("which seats do u want");
					for(int i=0;i<ns;i++)
					{
						int cs;
						cs=sc.nextInt();
						for(int g=0;g<=40;g++)
							{
								if(f2[cs-1]==0)
								{
									System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
									cs=sc.nextInt();
									g=0;
								}
							}
// here we have to create linked list for printing tickets								
									f2[cs-1]=0;
					}
								System.out.println();
							//	seats(ac1);
					break;
				case 3:
					System.out.println("You selected Route is \n	1.hyderbad");
					System.out.println("which type of class do u want \n\t 1.first class \n\t 2.Business class ");
					System.out.println("you selected the first class ");
					seats(f3);
					System.out.println("How many seats do u want");
				//	int ns;
					ns=sc.nextInt();
					System.out.println("which seats do u want");
					for(int i=0;i<ns;i++)
					{
						int cs;
						cs=sc.nextInt();
						for(int g=0;g<=40;g++)
							{
								if(f3[cs-1]==0)
								{
									System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
									cs=sc.nextInt();
									g=0;
								}
							}
// here we have to create linked list for printing tickets								
									f3[cs-1]=0;
					}
								System.out.println();
							//	seats(ac1);
					System.out.println("You selected package is \n			3.");
					break;
				case 4:
					System.out.println("You selected Route is \n	1.hyderbad");
					System.out.println("which type of class do u want \n\t 1.first class \n\t 2.Business class ");
					System.out.println("you selected the first class ");
					seats(f4);
					System.out.println("How many seats do u want");
			//		int ns;
					ns=sc.nextInt();
					System.out.println("which seats do u want");
					for(int i=0;i<ns;i++)
					{
						int cs;
						cs=sc.nextInt();
						for(int g=0;g<=40;g++)
							{
								if(f4[cs-1]==0)
								{
									System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
									cs=sc.nextInt();
									g=0;
								}
							}
// here we have to create linked list for printing tickets								
									f4[cs-1]=0;
					}
								System.out.println();
							//	seats(ac1);
					System.out.println("You selected package is \n			4.");
					break;
				case 5:
					System.out.println("You selected Route is \n	1.hyderbad");
					System.out.println("which type of class do u want \n\t 1.first class \n\t 2.Business class ");
					System.out.println("you selected the first class ");
					seats(f5);
					System.out.println("How many seats do u want");
			//		int ns;
					ns=sc.nextInt();
					System.out.println("which seats do u want");
					for(int i=0;i<ns;i++)
					{
						int cs;
						cs=sc.nextInt();
						for(int g=0;g<=40;g++)
							{
								if(f5[cs-1]==0)
								{
									System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
									cs=sc.nextInt();
									g=0;
								}
							}
// here we have to create linked list for printing tickets								
									f5[cs-1]=0;
					}
								System.out.println();
							//	seats(ac1);

					break;
				case 6:
					System.out.println("You selected Route is \n	1.hyderbad");
					System.out.println("which type of class do u want \n\t 1.first class \n\t 2.Business class ");
					System.out.println("you selected the first class ");
					seats(f6);
					System.out.println("How many seats do u want");
			//		int ns;
					ns=sc.nextInt();
					System.out.println("which seats do u want");
					for(int i=0;i<ns;i++)
					{
						int cs;
						cs=sc.nextInt();
						for(int g=0;g<=40;g++)
							{
								if(f6[cs-1]==0)
								{
									System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
									cs=sc.nextInt();
									g=0;
								}
							}
// here we have to create linked list for printing tickets								
									f6[cs-1]=0;
					}
								System.out.println();
							//	seats(ac1);

					break;
				case 7:
					break;
				case 8:
					break;
				default:
					System.out.println("you entered wrong choice try again");
		}
		}while(x!=1 && x!=2 && x!=3 && x!=4);
	}
	public static void seats(int a[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<60;i++)
		{
	//		if((i+1)%2==0)
	//		{
			if(i==0)
			{
				System.out.println("\t\t\t\t\tFirst class");
			}
			else if(i==30)
			{
				System.out.println("\t\t\t\t\tbusiness class");
			}
				System.out.print(i+1+" ");
				if(a[i]==1)
				{
					System.out.print("      	");
				}
				else
				{
					System.out.print("filled	");
				}
				
	//		}
	//		else
	/*	    {
				System.out.print(i+1+"W ");
				if(a[i]==1)
				{
					System.out.print("      	");
				}
				else
				{
					System.out.print("filled	");
				}
				
			}	*/	
			if((i+1)%6==0)
			{
				System.out.println("");
			}
		}
	}
    
}
