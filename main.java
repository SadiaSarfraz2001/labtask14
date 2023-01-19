package lab2;

import java.util.Scanner;
class Marksheet {
	public static void main(String arg[])
	{

	 String name, fname,rollno;    
	 int i, gtotal=0,count=0;
	 String subject[] = { " Mathematics ", " Programming ", " Physics "," Computer "," Econimics "," DataBase "}; 
	 String subcode[]= { "MA-102","PR-103","PY-101","CP-103","EN-101","DB-101"};
	 int midmarks[]= new int[6];
	 int semmarks[]= new int[6];
	  Scanner s = new Scanner(System.in);
	  System.out.println("\t Enter your Full Name: ");
	  name = s.nextLine();
	  System.out.println("\t Enter your Father Name:");
	  fname = s.nextLine();
	  System.out.println("\t Enter your Roll Number:");
	  rollno = s.nextLine();
	for(i=0;i<6;i++)
	{
	    System.out.println("\t Enter Midterm Marks for: "+subject[i]+":");
	    midmarks[i] = s.nextInt();
	}
	
	for(i=0;i<6;i++)
	{
	    System.out.println("\t Enter Final Exam Marks for: "+subject[i]+":");
	    semmarks[i] = s.nextInt();
	}

	System.out.println("\t\t\t\t\tYOUR RESULT\n");
	  System.out.println("\t\t College:\t"+"Sir Syed University of Engineering and technology");
	  System.out.print("\n\t\t Name:          " +name);
	  System.out.println("\t\tFather Name: \t" +fname);
	  System.out.println("\t\t Roll Number: \t" +rollno);
	System.out.println("\n\t\t "+"Subcode"+"\tmarks1"+"\tmarks2"+"\tTotal");
	for(i=0;i<6;i++)
	{
	       if(((midmarks[i])+(semmarks[i])) >=40)
	       {
	        System.out.println("\t\t "+subcode[i]+"\t\t "+midmarks[i]+"\t"+semmarks[i]+"\t"+((midmarks[i])+(semmarks[i])));
	       }
	       else
	      {
	      System.out.println("\t\t "+subcode[i]+"\t\t "+midmarks[i]+"\t"+semmarks[i]+"\t"+((midmarks[i])+(semmarks[i]))+"*");
	      count++;
	      }
	      gtotal = (gtotal + ((midmarks[i])+(semmarks[i])));
	}
	if(count >0)
	{
	 System.out.println("\n\t\t Grand Total:\t"+gtotal+"\tResult: \tFAIL");
	}
	else
	{
	System.out.println("\n\t\t Grand Total:\t"+gtotal+"\tResult:\tPASS");
	}
	}
	}