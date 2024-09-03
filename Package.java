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
public class Package {
    static int cash;
    static Payment ppa1=new Payment();
    static String str1="";static String str2="";static String str3="";
	static InputStreamReader pp=new InputStreamReader(System.in);
	static BufferedReader pd=new BufferedReader(pp);
	static Scanner sc1=new Scanner(System.in);
	static String spoint,dpoint;
	static String jdate,rdate;
	static int j,i=0;
	static String spoint1,dpoint1;
	static String jdate1,rdate1;
	static int l,k=0;
	static String sp[]=new String[5],dp[]=new String[5],jd[]=new String[5],rd[]=new String[5],pc[]=new String[5];
	static String sp1[]=new String[5],dp1[]=new String[5],jd1[]=new String[5],rd1[]=new String[5],pc1[]=new String[5];
	public static void add() throws IOException
	{
		System.out.println("Starting point is:");
		spoint=pd.readLine();
		System.out.println("destination point is:");
		dpoint=pd.readLine();
		System.out.println("Date of jorney:");
		jdate=pd.readLine();
		System.out.println("return Date of jorney:");
		rdate=pd.readLine();
		switch(i)
		{
		case 0:
			System.out.println("DETAILS:");
			str1=pd.readLine();
	
			break;
		case 1:
			System.out.println("DETAILS:");
	
			str2=pd.readLine();
	
			break;
		case 2:
			System.out.println("DETAILS:");

			str3=pd.readLine();
	
			
			
		}
		sp[i]=spoint;
		dp[i]=dpoint;jd[i]=jdate;rd[i]=rdate;
		i++;
		System.out.println("Succesfully added package");
		
	}
	public static void display() throws IOException
	{
		System.out.println("1.HYDERABAD to DELHI at the time x:x  \nPACKAGE DETAILS A:\n  1.It is 5 days wonderful trip\n  2.toal number of people accomable to trip is 30 to 40 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-3 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 4 : Return journey \n  4. Cost: 1.5 lakh for whole package\nPACKAGE DETAILS B:\n  1.It is 5 days wonderful trip\n  2.toal number of people accomable to trip is 10 to 20 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-3 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 4 : Return journey \n  4. Cost: 0.7 lakh for whole package\nPACKAGE DETAILS C:\n  1.It is 6 days wonderful trip\n  2.toal number of people accomable to trip is 5 to 9 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2,3 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-4,5 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 6 : Return journey \n  4. Cost: 1.5 lakh for whole package");
		System.out.println("2.HYDERABAD to GOA at the time x:x");
		System.out.println("3.vijayawada to Banglore at the time x:x  ");
		System.out.println("4.Vizag to Goa at the time x:x  ");
		for(j=0;j<i;j++)
		{
			System.out.println(sp[j]+" to "+dp[j]+"at the time"+jd[j]+" : "+rd[j]);
			switch(j)
			{
			case 0:
				System.out.println("DETAILS:");
	     		String arr1[]=str1.split("@");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.println(arr1[i]);
				}
				break;
			case 1:
				System.out.println("DETAILS:");
				String arr2[]=str2.split("@");
				for(int i=0;i<arr2.length;i++)
				{
					System.out.println(arr2[i]);
				}
				
				break;
			case 2:
				System.out.println("DETAILS:");
				String arr3[]=str3.split("@");
				for(int i=0;i<arr3.length;i++)
				{
					System.out.println(arr3[i]);
				}
				
				
				
			}
		}
	}
	public static void Addroute() throws IOException
	{
		System.out.println("Starting point is:");
		spoint1=pd.readLine();
		System.out.println("destination point is:");
		dpoint1=pd.readLine();
		System.out.println("Date of jorney:");
		jdate1=pd.readLine();
		System.out.println("return Date of jorney:");
		rdate1=pd.readLine();
		sp1[k]=spoint;
		dp1[k]=dpoint;jd1[k]=jdate;rd1[k]=rdate;
		k++;
		System.out.println("Succesfully added Route");
	}
	public static void displayroutes()
	{
		System.out.println("1.Gnt to Tajmahal at the time x:x  \n2.hyd to J&k at the time x:x   \n3.vijayawada to Rameswaram at the time x:x  \n4.Vizag to Goa at the time x:x  ");
		for(j=0;j<i;j++)
		{
			System.out.println(sp[j]+" to "+dp[j]+"at the time"+jd[j]+" : "+rd[j]);
		}
	}
	public static void bookpackage() throws IOException
	{
		System.out.println("1.HYDERABAD to DELHI at the time x:x  \nPACKAGE DETAILS A:\n  1.It is 5 days wonderful trip\n  2.toal number of people accomable to trip is 30 to 40 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-3 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 4 : Return journey \n  4. Cost: 1.5 lakh for whole package\nPACKAGE DETAILS B:\n  1.It is 5 days wonderful trip\n  2.toal number of people accomable to trip is 10 to 20 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-3 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 4 : Return journey \n  4. Cost: 0.7 lakh for whole package\nPACKAGE DETAILS C:\n  1.It is 6 days wonderful trip\n  2.toal number of people accomable to trip is 5 to 9 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2,3 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-4,5 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 6 : Return journey \n  4. Cost: 1.5 lakh for whole package");
		System.out.println("2.HYDERABAD to GOA at the time x:x");
		System.out.println("3.vijayawada to Banglore at the time x:x  ");
		System.out.println("4.Vizag to Goa at the time x:x  ");
		for(j=0;j<i;j++)
		{
			System.out.println(sp[j]+" to "+dp[j]+"at the time"+jd[j]+" : "+rd[j]);
			switch(j)
			{
			case 0:
				System.out.println("DETAILS:");
	     		String arr1[]=str1.split("@");
				for(int i=0;i<arr1.length;i++)
				{
					System.out.println(arr1[i]);
				}
				break;
			case 1:
				System.out.println("DETAILS:");
				String arr2[]=str2.split("@");
				for(int i=0;i<arr2.length;i++)
				{
					System.out.println(arr2[i]);
				}
				
				break;
			case 2:
				System.out.println("DETAILS:");
				String arr3[]=str3.split("@");
				for(int i=0;i<arr3.length;i++)
				{
					System.out.println(arr3[i]);
				}
				
				
				
			}
			
		}
		System.out.println("Enter the trip number");
		int tn;
		char pn;
		tn=sc1.nextInt();
		switch(tn)
		{
			case 1:
				System.out.println("enter the package number");
				pn=sc1.next().charAt(0);
				switch(pn)
				{
				case 'A':
				case 'a':
					System.out.println("Mega package");
                                        System.out.println("You selected package details is");
                                        System.out.println("1.It is 5 days wonderful trip\n  2.toal number of people accomable to trip is 30 to 40 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-3 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 4 : Return journey \n  4. Cost: 1.5 lakh for whole package");
                                        System.out.println("Is this package ok for u\nif not u can reselect\nfor reselect press else press 0");
                                        int rs=0;
                                        rs=sc1.nextInt();
                                        if(rs==1)
                                        {
                                            bookpackage();
                                        }
                                        else if(rs==0)
                                        {
                                            System.out.println("This the amount u charged\n u have to pay through online only\n1.5 lakh");
                                            cash=1500000;
                                         //   System.out.println(cash);
                                            ppa1.card(cash);
                                            
                                            
                                        }
                                case 'B':
				case 'b':
					System.out.println("meadium package");
                                        System.out.println("You selected package details is");
                                        System.out.println("1.It is 5 days wonderful trip\n  2.toal number of people accomable to trip is 10 to 20 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-3 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 4 : Return journey \n  4. Cost: 0.7 lakh for whole package");
                                        System.out.println("Is this package ok for u\nif not u can reselect\nfor reselect press else press 0");
                                         rs=0;
                                        rs=sc1.nextInt();
                                        if(rs==1)
                                        {
                                            bookpackage();
                                        }
                                        else if(rs==0)
                                        {
                                            System.out.println("This the amount u charged\n u have to pay through online only\n1.5 lakh");
                                            cash=75000;
                                         //   System.out.println(cash);
                                            ppa1.card(cash);
                                            
                                            
                                        }
                                case 'C':
				case 'c':
					System.out.println("small package");
					System.out.println("You selected package details is");
                                        System.out.println(" 1.It is 6 days wonderful trip\n  2.toal number of people accomable to trip is 5 to 9 members\n  3.visiting places to visit in delhi \n\t day-1 : taking rest under piccadilly hotel,novotel hotel \n\t day-2,3 : Tourist attractions like tajmahal,quitabminar,Gate Way of India\n\t day-4,5 : Doing shopping in R-city mall-clip-art museum,Grand venice mall\n\t day 6 : Return journey \n  4. Cost: 0.4 lakh for whole package");
					System.out.println("Is this package ok for u\nif not u can reselect\nfor reselect press else press 0");
                                         rs=0;
                                        rs=sc1.nextInt();
                                        if(rs==1)
                                        {
                                            bookpackage();
                                        }
                                        else if(rs==0)
                                        {
                                            System.out.println("This the amount u charged\n u have to pay through online only\n1.5 lakh");
                                            cash=40000;
                                         //   System.out.println(cash);
                                            ppa1.card(cash);
                                            
                                            
                                        }				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:		
		}		
	}
	}

    
}
