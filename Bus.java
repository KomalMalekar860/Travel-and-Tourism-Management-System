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

import javax.swing.Spring;
/**
 *
 * @author 18mis7023
 */
public class Bus {
    static Payment bpa1=new Payment();
    static int totalamount;
    int a=0,b=0,d=0;
	static Package pac1=new Package();
	static String emaili="";
	static int x,c;
/*	static String nb1[]=new String[40];
	static String nb2[]=new String[40];
	static String nb3[]=new String[40];
	static String nb4[]=new String[40];
	static String nac1[]=new String[40];
	static String nac2[]=new String[40];
	static String nac3[]=new String[40];
	static String nac4[]=new String[40];
	static String phb1[]=new String[40];
	static String phb2[]=new String[40];
	static String phb3[]=new String[40];
	static String phb4[]=new String[40];
	static String phbc1[]=new String[40];
	static String phbc2[]=new String[40];
	static String phbc3[]=new String[40];
	static String phbc4[]=new String[40];
*/	//for non ac buses
	static int a1[]=new int[40];
	static int a2[]=new int[40];
	static int a3[]=new int[40];
	static int a4[]=new int[40];
/*	static int a5[]=new int[40];
	static int a6[]=new int[40];
	static int a7[]=new int[40];
	static int a8[]=new int[40];*/
// for ac buses 
    static int ac1[]=new int[40];
	static int ac2[]=new int[40];
	static int ac3[]=new int[40];
	static int ac4[]=new int[40];
/*	static int ac5[]=new int[40];
	static int ac6[]=new int[40];
	static int ac7[]=new int[40];
	static int ac8[]=new int[40];	
	static int mb1[]=new int[20];
	static int mb2[]=new int[20];
	static int mb3[]=new int[20];
	static int mb4[]=new int[20];
	static int mb5[]=new int[20];
	static int mb6[]=new int[20];
	static int mb7[]=new int[20];
	static int mb8[]=new int[20];*/

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		InputStreamReader ss=new InputStreamReader(System.in);
		BufferedReader sd=new BufferedReader(ss);
		
		
	/*	for(int i=0;i<40;i++)
		{
			a1[i]=1;a2[i]=1;a3[i]=1;a4[i]=1;ac1[i]=1;ac2[i]=1;ac3[i]=1;ac4[i]=1;
		
		}*/

	}
	public static void routes() throws IOException
	{
		for(int i=0;i<40;i++)
		{
			a1[i]=1;a2[i]=1;a3[i]=1;a4[i]=1;ac1[i]=1;ac2[i]=1;ac3[i]=1;ac4[i]=1;
		
		}
		for(int i=0;i<40;i+=7)
		{
			a1[i]=0;a2[i]=0;a3[i]=0;a4[i]=0;ac1[i]=0;ac2[i]=0;ac3[i]=0;ac4[i]=0;
		
		}
		System.out.println("Here they are some tourist places for trip with pakage throught the buses");
		do{
			pac1.display();
			System.out.println("Plese can you find the best route and click for corresponding package number");
			x=sc.nextInt();       // for storing package number
			switch(x)
			{
				case 1:
					System.out.println("You selected package is \n			1.Gnt to Tajmahal");
					System.out.println("which type of bus you want for journey \n\t 1.AC \n\t 2.NON AC ");
					int bt;
					bt=sc.nextInt();
					do{
						switch(bt)
						{
							case 1:
								System.out.println("you selected the AC  bus for your journey");
								seats(ac1);
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
										if(ac1[cs-1]==0)
										{
											System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
											cs=sc.nextInt();
											g=0;
										}
									}
// here we have to create linked list for printing tickets								
									ac1[cs-1]=0;
								}
                                                                 totalamount=ns*300;
                                                                bpa1.card(totalamount);
								System.out.println();
								seats(ac1);
								break;
							case 2:
								System.out.println("you selected the NON-AC  bus for your journey");
								seats(a1);
								System.out.println("How many seats do u want");
								int ns1;
								ns1=sc.nextInt();
								System.out.println("which seats do u want");
								for(int i=0;i<ns1;i++)
								{
									int cs;
									cs=sc.nextInt();
                                                                        if(a1[cs-1]==0)
										{
											System.out.println("the seats you have choosen is already booked so please go ahead with another seat");
											cs=sc.nextInt();
                                                                                        int g = 0;
										}
									a1[cs-1]=0;
								}
                                                                totalamount=ns1*350;
                                                                bpa1.card(totalamount);
								seats(a1);
							}
						
					}while(bt!=1 && bt!=2);
					break;

				case 2:
					System.out.println("You selected package is \n			2.tirupati to bangalore");
					break;
				case 3:
					System.out.println("You selected package is \n			3.");
					break;
				case 4:
					System.out.println("You selected package is \n			4.");
					break;
				case 5:
					break;
				case 6:
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
		for(int i=0;i<40;i++)
		{
			if((i+1)%2==0)
			{
				System.out.print(i+1+" ");
				if(a[i]==1)
				{
					System.out.print("      	");
				}
				else
				{
					System.out.print("filled	");
				}
				
			}
			else
			{
				System.out.print(i+1+"W ");
				if(a[i]==1)
				{
					System.out.print("      	");
				}
				else
				{
					System.out.print("filled	");
				}
				
			}
			if((i+1)%4==0)
			{
				System.out.println("");
			}
		}
	}

  //  void routes() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
