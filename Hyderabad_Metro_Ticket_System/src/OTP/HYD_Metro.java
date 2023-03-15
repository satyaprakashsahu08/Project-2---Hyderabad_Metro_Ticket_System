package OTP;

import java.util.Random;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class HYD_Metro {
	
	Scanner sc = new Scanner(System.in);
	final static String [] redLine= {"Miyapur","JNTU College","KPHB Colony","Kukatpally","Balanagar","Moosapet","Bharat Nagar","Erragadda","ESI Hospital","SR Nagar","Ameerpet","Punjagutta","Irrum Manzil","Khairatabad","Lakdi ka pul","Assembly","Nampally","Gandhi Bhavan","Osmania Medical College","MG Bus Station","Malakpet","New Market","Musarambagh","Dilsukhnagar","Chaitanyapuri","Victoria Memorial","LB Nagar"};
	final static int [] redLineDis= {0,2,1,1,3,1,1,1,1,2, 1,2,1,1,1,1,1,1,1,2, 1,3,1,1,1,1,1};
	final static String [] greenLine= {"Parade Grounds","Secunderabad West","Gandhi Hospital","Musheerabad","RTC X Roads","Chikkadpally","Narayanaguda","Sultan Bazaar","MG Bus Station"};
	final static int[] greenLineDis= {0,1,1,3,1,1,1,2,1};
	final static String [] blueLine= {"Nagole","Uppal","Stadium","NGRI","Habsiguda","Tarnaka","Mettuguda","Secunderabad East","Parade Ground","Paradise","Rasoolpura","Prakash Nagar","Begumpet","Ameerpet","Madhura Nagar","Yusufguda","Jubilee Hills Road No 5","Jubilee Hills Check Post","Peddama Gudi","Madhapur","Durgam Cheruvu","HITEC City","Raidurg"};
	final static int[] blueLineDis= {0,1,1,1,1,3,2,1,1, 1,1,1,1, 2,1,2,1,1,1,1,1,2,1};
	
	final static String [] red1Blue1= {"Miyapur","JNTU College","KPHB Colony","Kukatpally","Balanagar","Moosapet","Bharat Nagar","Erragadda","ESI Hospital","SR Nagar","Ameerpet","Begumpet","Prakash Nagar","Rasoolpura","Paradise","Parade Ground","Secunderabad East","Metuguda","Tarnaka","Habsiguda","NGRI","Stadium","Uppal","Nagole"};
	final static int [] red1Blue1Dis= {0,2,1,1,3,1,1,1,1,2,1, 1,2,1,1,1,1,1,2,1,2,1,1,1};
	final static String [] red1Blue2= {"Miyapur","JNTU College","KPHB Colony","Kukatpally","Balanagar","Moosapet","Bharat Nagar","Erragadda","ESI Hospital","SR Nagar","Ameerpet","Madhura Nagar","Yusufguda","Jubilee Hills Road No 5","Jubilee Hills Check Post","Peddama Gudi","Madhapur","Durgam Cheruvu","HITEC City","Raidurg"};
	final static int [] red1Blue2Dis= {0,2,1,1,3,1,1,1,1,2,1, 1,1,1,1,3,2,1,1,1,};
	
	final static String [] red2Blue1= {"LB Nagar","Victoria Memorial","Chaitanyapuri","Dilsukhnagar","Musarambagh","New Market","Malakpet","MG Bus Station","Osmania Medical College","Gandhi Bhavan","Nampally","Assembly","Lakdi Ka Pul","Khairatabad","Irrum Manzil","Punjagutta","Ameerpet","Begumpet","Prakash Nagar","Rasoolpura","Paradise","Parade Ground","Secunderabad East","Mettuguda","Tarnaka","Habsiguda","NGRI","Stadium","Uppal","Nagole"};
	final static int [] red2Blue1Dis= {0,1,1,1,1,3,1,2,1,1,1,1,1,1,1,2,1, 1,2,1,1,1,1,1,2,1,2,1,1,1};
	final static String [] red2Blue2= {"LB Nagar","Victoria Memorial","Chaitanyapuri","Dilsukhnagar","Musarambagh","New Market","Malakpet","MG Bus Station","Osmania Medical College","Gandhi Bhavan","Nampally","Assembly","Lakdi Ka Pul","Khairatabad","Irrum Manzil","Punjagutta","Ameerpet","Madhura Nagar","Yusufguda","Jubilee Hills Road No 5","Jubilee Hills Check Post","Peddama Gudi","Madhapur","Durgam Cheruvu","HITEC City","Raidurg"};
	final static int [] red2Blue2Dis= {0,1,1,1,1,3,1,2, 1,1,1,1,1,1,1,2,1, 1,1,1,1,3,2,1,1,1,};
	
	final static String [] red1Green= {"Miyapur","JNTU College","KPHB Colony","Kukatpally","Balanagar","Moosapet","Bharat Nagar","Erragadda","ESI Hospital","SR Nagar","Ameerpet","Punjagutta","Irrum Manzil","Khairatabad","Lakdi ka pul","Assembly","Nampally","Gandhi Bhavan","Osmania Medical College","MG Bus Station","Sultan Bazaar","Narayanaguda","Chikkadpally","RTC X Roads","Musheerabad","Gandhi Hospital","Secunderabad West","Parade Ground"};
	final static int [] red1GreenDis= {0,2,1,1,3,1,1,1,1,2, 1,2,1,1,1,1,1,1,1,2, 1,2,1,1,1,3,1,1};
	final static String [] red3Green= {"Parade Grounds","Secunderabad West","Gandhi Hospital","Musheerabad","RTC X Roads","Chikkadpally","Narayanaguda","Sultan Bazaar","MG Bus Station","Malakpet","New Market","Musarambagh","Dilsukhnagar","Chaitanyapuri","Victoria Memorial","LB Nagar"};
	final static int [] red3GreenDis= {0,1,1,3,1,1,1,2,1, 1,3,1,1,1,1,1};
	
	final static String [] red1Blue2Green= {"Miyapur","JNTU College","KPHB Colony","Kukatpally","Balanagar","Moosapet","Bharat Nagar","Erragadda","ESI Hospital","SR Nagar","Ameerpet","Begumpet","Prakash Nagar","Rasoolpura","Paradise","Parade Ground","Secunderabad West","Gandhi Hospital","Musheerabad","RTC X Roads","Chikkadpally","Narayanaguda","Sultan Bazaar","MG Bus Station"};
	final static int [] red1Blue2GreenDis= {0,2,1,1,3,1,1,1,1,2,1, 1,1,1,1, 1,1,1,3,1,1,1,2,1};
	final static String [] red3GreenBlue1= {"LB Nagar","Victoria Memorial","Chaitanyapuri","Dilsukhnagar","Musarambagh","New Market","Malakpet","MG Bus Station","Sultan Bazaar","Narayanaguda","Chikkadpally","RTC X Roads","Musheerabad","Gandhi Hospital","Secunderabad West","Parade Ground","Secunderabad East","Metuguda","Tarnaka","Habsiguda","NGRI","Stadium","Uppal","Nagole"};
	final static int [] red3GreenBlue1Dis= {0,1,1,1,1,3,1,2, 1,2,1,1,1,3,1,1, 1,1,2,1,2,1,1,1};
	final static String [] red3GreenBlue2= {"LB Nagar","Victoria Memorial","Chaitanyapuri","Dilsukhnagar","Musarambagh","New Market","Malakpet","MG Bus Station","Sultan Bazaar","Narayanaguda","Chikkadpally","RTC X Roads","Musheerabad","Gandhi Hospital","Secunderabad West","Parade Ground","Paradise","Rasoolpura","Prakash Nagar","Begumpet","Ameerpet","Madhura Nagar","Yusufguda","Jubilee Hills Road No 5","Jubilee Hills Check Post","Peddama Gudi","Madhapur","Durgam Cheruvu","HITEC City","Raidurg"};
	final static int [] red3GreenBlue2Dis= {0,1,1,1,1,3,1,2, 1,2,1,1,1,3,1,1, 1,1,1,1,1,3,2,1,1, 1,1,1,1,1};
	
	final static String [] red2Blue1Green= {"MG Bus Station","Osmania Medical College","Gandhi Bhavan","Nampally","Assembly","Lakdi Ka Pul","Khairatabad","Irrum Manzil","Punjagutta","Ameerpet","Begumpet","Prakash Nagar","Rasoolpura","Paradise","Parade Ground","Secunderabad West","Gandhi Hospital","Musheerabad","RTC X Roads","Chikkadpally","Narayanaguda","Sultan Bazaar"};
	final static int [] red2Blue1GreenDis= {0,1,1,1,1,1,1,2,1,1, 1,1,1,1, 1,1,1,3,1,1,1,2};
	final static String [] greenRed2Blue1= {"Parade Ground","Secunderabad West","Gandhi Hospital","Musheerabad","RTC X Roads","Chikkadpally","Narayanaguda","Sultan Bazaar","MG Bus Station","Osmania Medical College","Gandhi Bhavan","Nampally","Assembly","Lakdi Ka Pul","Khairatabad","Irrum Manzil","Punjagutta","Ameerpet","Begumpet","Prakash Nagar","Rasoolpura","Paradise"};
	final static int [] greenRed2Blue1Dis= {0,1,1,3,1,1,1,2,1, 1,1,1,1,1,1,2,1,1, 1,1,1,1};
	
	final static String [] metroStations= {"Miyapur","JNTU College","KPHB Colony","Kukatpally","Balanagar","Moosapet","Bharat Nagar","Erragadda","ESI Hospital","SR Nagar","Ameerpet","Punjagutta","Irrum Manzil","Khairatabad","Lakdi ka pul","Assembly","Nampally","Gandhi Bhavan","Osmania Medical College","MG Bus Station","Malakpet","New Market","Musarambagh","Dilsukhnagar","Chaitanyapuri","Victoria Memorial","LB Nagar","Parade Grounds","Secunderabad West","Gandhi Hospital","Musheerabad","RTC X Roads","Chikkadpally","Narayanaguda","Sultan Bazaar","Nagole","Uppal","Stadium","NGRI","Habsiguda","Tarnaka","Mettuguda","Secunderabad East","Paradise","Rasoolpura","Prakash Nagar","Begumpet","Madhura Nagar","Yusufguda","Jubilee Hills Road No 5","Jubilee Hills Check Post","Peddama Gudi","Madhapur","Durgam Cheruvu","HITEC City","Raidurg"};
	
	int passenger1_6() // No. of passenger
	{
		System.out.print("Passenger: ");
		int pass=sc.nextInt();
		sc.nextLine();
		if(pass<1||pass>6) {
			System.out.printf("%45s","Passenger limit is 1 to 6\n");
			return passenger1_6();
		}
		System.out.println();
		return pass;
		
	}


	String from()	// get a source station name from user and check whether its correct and available station or not
	{
		System.out.print("From: ");
		String fr=sc.nextLine();
		
		for(String stat:metroStations)
		{
			if(fr.equalsIgnoreCase(stat))return stat;
		}
		suggestions(fr);
		return from();
	}
	
	
	String to() // get s destination station from user
	{
		System.out.print("To: ");
		String fr=sc.nextLine();
		
		for(String stat:metroStations)
		{
			if(fr.equalsIgnoreCase(stat))return stat;
		}
		suggestions(fr);
		return to();
	}
	
	
	void suggestions(String str)   // to print all the suggestion( station related to user entered )
	{
		boolean part1=false;
		for(String station: metroStations)
		{
			if(str.length()>3)
			{
				if(station.substring(0,3).equalsIgnoreCase(str.substring(0,3)))
				{
					System.out.println("\t\t"+station);
					part1=true;
				}
			}
			else
			{
				if(station.substring(0,str.length()).equalsIgnoreCase(str))
				{
					System.out.println("\t\t"+station);
					part1=true;
				}
			}
		}
		
		
		if(part1==false)
		{
			for(String station: metroStations)
			{
				if(str.length()>3)
				{
					if(station.toLowerCase().contains(str.substring(0,4).toLowerCase()))
					{
						System.out.println("\t\t"+station);
						part1=true;
					}
				}
				else
				{
					if(station.toLowerCase().contains(str.toLowerCase()))
					{
						System.out.println("\t\t"+station);
						part1=true;
					}
				}
			}
		}
		if(part1==false)System.out.println("\t\tStation not found");
	}
	
	
	int [] checkLine(String start, String end)// to check the routes available from source to destination.
	{
		boolean s=false;
		boolean e=false;
		int [] routes= new int[14];
		for(String red:redLine)
		{
			if(red.equalsIgnoreCase(start))s=true;
			if(red.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[0]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
	
		for(String green:greenLine)
		{
			if(green.equalsIgnoreCase(start))s=true;
			if(green.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[1]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String blue:blueLine)
		{
			if(blue.equalsIgnoreCase(start))s=true;
			if(blue.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[2]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r1b1:red1Blue1)
		{
			if(r1b1.equalsIgnoreCase(start))s=true;
			if(r1b1.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[3]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r1b2:red1Blue2)
		{
			if(r1b2.equalsIgnoreCase(start))s=true;
			if(r1b2.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[4]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r2b1:red2Blue1)
		{
			if(r2b1.equalsIgnoreCase(start))s=true;
			if(r2b1.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[5]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r2b2:red2Blue2)
		{
			if(r2b2.equalsIgnoreCase(start))s=true;
			if(r2b2.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[6]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r1g:red1Green)
		{
			if(r1g.equalsIgnoreCase(start))s=true;
			if(r1g.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[7]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r3g:red3Green)
		{
			if(r3g.equalsIgnoreCase(start))s=true;
			if(r3g.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[8]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r1b2g:red1Blue2Green)
		{
			if(r1b2g.equalsIgnoreCase(start))s=true;
			if(r1b2g.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[9]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r3gb1:red3GreenBlue1)
		{
			if(r3gb1.equalsIgnoreCase(start))s=true;
			if(r3gb1.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[10]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r3gb2:red3GreenBlue2)
		{
			if(r3gb2.equalsIgnoreCase(start))s=true;
			if(r3gb2.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[11]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String r2b1g:red2Blue1Green)
		{
			if(r2b1g.equalsIgnoreCase(start))s=true;
			if(r2b1g.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[12]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		
		for(String gr2b1:greenRed2Blue1)
		{
			if(gr2b1.equalsIgnoreCase(start))s=true;
			if(gr2b1.equalsIgnoreCase(end))e=true;
		}
		if(s==true&&e==true)
		{
			routes[13]=1;
			s=false;
			e=false;
		}
		else
		{
			s=false;
			e=false;
		}
		return routes;	
	}
	
	
	
	int[] calculateDistance(String start, String end)// calculate the distances of all available routes
	{
		int [] routes=checkLine(start,end);
		int [] distance= {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		if(routes[0]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<redLine.length;i++)
			{
				if(redLine[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(redLine[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[0]+=redLineDis[i];
			}
		}
		
		if(routes[1]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<greenLine.length;i++)
			{
				if(greenLine[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(greenLine[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[1]+=greenLineDis[i];
			}
		}
		
		if(routes[2]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<blueLine.length;i++)
			{
				if(blueLine[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(blueLine[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[2]+=blueLineDis[i];
			}
		}
		
		if(routes[3]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red1Blue1.length;i++)
			{
				if(red1Blue1[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red1Blue1[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[3]+=red1Blue1Dis[i];
			}
		}
		
		if(routes[4]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red1Blue2.length;i++)
			{
				if(red1Blue2[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red1Blue2[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[4]+=red1Blue2Dis[i];
			}
		}
		
		if(routes[5]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red2Blue1.length;i++)
			{
				if(red2Blue1[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red2Blue1[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[5]+=red2Blue1Dis[i];
			}
		}
		
		if(routes[6]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red2Blue2.length;i++)
			{
				if(red2Blue2[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red2Blue2[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[6]+=red2Blue2Dis[i];
			}
		}
		
		if(routes[7]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red1Green.length;i++)
			{
				if(red1Green[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red1Green[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[7]+=red1GreenDis[i];
			}
		}
		
		if(routes[8]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red1Green.length;i++)
			{
				if(red3Green[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red3Green[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[8]+=red3GreenDis[i];
			}
		}
		
		if(routes[9]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red1Blue2Green.length;i++)
			{
				if(red1Blue2Green[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red1Blue2Green[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[9]+=red1Blue2GreenDis[i];
			}
		}
		
		if(routes[10]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red3GreenBlue1.length;i++)
			{
				if(red3GreenBlue1[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red3GreenBlue1[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[10]+=red3GreenBlue1Dis[i];
			}
		}
		
		if(routes[11]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red3GreenBlue2.length;i++)
			{
				if(red3GreenBlue2[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red3GreenBlue2[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[11]+=red3GreenBlue2Dis[i];
			}
		}
		
		if(routes[12]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<red2Blue1Green.length;i++)
			{
				if(red2Blue1Green[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(red2Blue1Green[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[12]+=red2Blue1GreenDis[i];
			}
		}
		
		
		if(routes[13]==1)
		{
			int inds=0;
			int inde=0;
			for(int i=0;i<greenRed2Blue1.length;i++)
			{
				if(greenRed2Blue1[i].equalsIgnoreCase(start))
				{
					inds=i;
				}
				if(greenRed2Blue1[i].equalsIgnoreCase(end))
				{
					inde=i;
				}
			}
			int big=inds>inde?inds:inde;
			int small=inds<inde?inds:inde;
			for(int i=small+1;i<=big;i++)
			{
				distance[13]+=greenRed2Blue1Dis[i];
			}
		}
		return distance;
		
	}
	
	
	int  shortestDistance(int [] distance)// to get the shortest route distance
	{
		int shortest=100;
		for(int i=0;i<distance.length-1;i++)
		{
			if(distance[i]<shortest&&distance[i]>0)
				{
					shortest=distance[i];
				}
		}
		return shortest;
	}

	
	int priceRate(int distance)// price rate according to distance
	{
		if(distance<=2)return 10;
		else if(distance<=4)return 15;
		else if(distance<=6)return 25;
		else if(distance<=8)return 30;
		else if(distance<=10)return 35;
		else if(distance<=14)return 40;
		else if(distance<=18)return 45;
		else if(distance<=22)return 50;
		else if(distance<=26)return 55;
		else return 60;
	}
	
	
	int price(int shortestDis)// price of journey 
	{
		return priceRate(shortestDis);
		
	}
	
	
	int [] ticketType(String start, String end,int pass)// ticket type one way or two way
	{
		int p1=pass*price(shortestDistance(calculateDistance(start,end)));
		System.out.print("\n1. One way ticket "+"[ "+p1+" Rs "+"]\t");
		System.out.println("\t2. Two way ticket "+"[ "+2*p1+" Rs "+"]");
		System.out.print("Ticket Type:");
		int type=sc.nextInt();
		if(type!=1&&type!=2)
		{
			System.out.println("Enter valid options!");
			ticketType(start, end, pass);
		}
		int [] priceType= {p1,type};
		return priceType;
	}
	

	String [] BookOTPTicket() // to get data from user 
	{
		System.out.println();
		int passenger=passenger1_6();
		String start=from();
		String end=to();
		if(start.equals(end))
		{
			System.out.println("\nSource and Destination must be different.\n");
			return BookOTPTicket();
			
		}
		int [] ticket=ticketType(start,end,passenger);
		String pass= passenger+"";
		String tic = ticket[1]+"";
		String price = ticket[0]+"";
		String [] result = {start,end,pass,tic,price};
		return  result;
		
		
	}
	
	int[] get_OTP() // to generate a random OTP
	{
		Random rndm=new Random();
		int otp[]= new int[8];
		
		for(int i=0;i<otp.length;i++)
		{
			otp[i]=rndm.nextInt(10);
		}
		return otp;
	}
	
	void option()
	{
		System.out.printf("\n\n%70s","DO YOU WANT TO\n\n");
		System.out.print("1. Book more OTP Tickets\n");
		System.out.printf("2. Exit");
		System.out.printf("\n\nOption : ");
		int option=sc.nextInt();
		if(option==1) ticket();
		else if(option==2)
		{
			sc.close();
			return;
		}
		else 
		{
			System.out.println("Invalid Option!");
			option();
		}
	}
	
	void ticket() // printing ticket
	{
		System.out.println("\n\n\t\t\t\t\t\t_____\\   HYDERABAD METRO   /____\n\n");
		System.out.println("[______]=[______]=[______]=[______]=[______]=[______]=[______]=[______]=[______]=[______]=|[ i>]");
		System.out.println("oo  oo   oo   oo  oo   oo  oo   oo   oo  oo   oo  oo   oo  oo   oo  oo    oo  oo   oo  oo    o  o");
		System.out.println("==========================================================================");
		
			String [] result= BookOTPTicket();
			System.out.println("\n\n\n\n8<-------------------------------------------------------------------------------------------");
			System.out.println("___________________________________________________________________________________________");
			System.out.printf("\n%70s%67s","Enter this OTP at Metro Entry\n","and Exit points\n\n\n");
			System.out.printf("%-50s==>%50s","| Starting From |","| Going to |\n");
			System.out.printf("%-50s%57s","-----------------","------------\n");
			System.out.printf("%-100s%s\n\n",result[0],result[1]);
			for(int i=1;i<=Integer.parseInt(result[2]);i++) 
			{
				System.out.printf("%50s%d OTP : ","Passenger",i);
				int [] otp=get_OTP();
				for(int j=0;j<otp.length;j++)
				{
					System.out.print(otp[j]);
				}
				System.out.println("\n");
			}
			DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("\nExpires : "+dtf.format(now)+", 11:59PM");
			System.out.println("\n___________________________________________________________________________________________\n");
			if(Integer.parseInt(result[3])==2)
			{
				System.out.printf("%-50s==>%50s","| Starting From |","| Going to |\n");
				System.out.printf("%-50s%57s","-----------------","------------\n");
				System.out.printf("%-100s%s\n\n",result[1],result[0]);
				for(int i=1;i<=Integer.parseInt(result[2]);i++) 
				{
					System.out.printf("%50s%d OTP : ","Passenger",i);
					int [] otp=get_OTP();
					for(int j=0;j<otp.length;j++)
					{
						System.out.print(otp[j]);
					}
					System.out.println("\n");
				}
				System.out.println("\nExpires : "+dtf.format(now)+", 11:59PM");
				System.out.println("\n___________________________________________________________________________________________\n");
			}
			System.out.printf("%65s","PAYMENT\n\n");
			System.out.printf("%-50s%s%50s","Type","Passengers","Amount\n");
			System.out.printf("%-50s%s%50s","------","-------------","-----------\n");
			if(Integer.parseInt(result[3])==1)
			{
				System.out.printf("%-50s%5s%54s Rs\n","One Way Ticket",Integer.parseInt(result[2]),Integer.parseInt(result[4]));
			}
			else if(Integer.parseInt(result[3])==2)
			{
				System.out.printf("%-50s%5s%54s Rs\n","Two Way Ticket",Integer.parseInt(result[2]),2*Integer.parseInt(result[4]));
			}
			DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("hh:mm:ss");
			System.out.printf("\nDate: %-90sTime: %s",dtf.format(now),dtf1.format(now));
			
			System.out.println("\n___________________________________________________________________________________________");
			System.out.println("8<-------------------------------------------------------------------------------------------\n\n\n\n\n\n");
			option();
		
	}
	
	
	public static void main(String[] args) {
			new HYD_Metro().ticket();
	}
}
