import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

class MyObjectOutputStream extends ObjectOutputStream {
	 
    // Constructor of ths class
    // 1. Default
    MyObjectOutputStream() throws IOException
    {
 
        // Super keyword refers to parent class instance
        super();
    }
 
    // Constructor of ths class
    // 1. Parameterized constructor
    MyObjectOutputStream(OutputStream o) throws IOException
    {
        super(o);
    }
 
    // Method of this class
    public void writeStreamHeader() throws IOException
    {
        return;
    }
}

public class ContactInfoApp implements Serializable{
//Static variables declaration
	static HashMap m = new HashMap();
	static String EmailId;
	static int phoneNo;
	static String place;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static FileInputStream fis;
	static ObjectInputStream ois;
	private static File f=new File("abc.txt");
	private static File f1=new File("adc.txt");
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		int x=0;
		while(x!=-1)
		{
		System.out.println("Hi Welcome to Sathiya's Contact Info Storage");
		System.out.println("--------------------------------------------");
		System.out.println("What kind of action you need to perform? Enter your Choice: ");
		System.out.println("\nPress:\n1 - Add Contact \n2 - Update Contact by Email-Id \n3 - Find Contact by Email-Id"
				+ "\n4 - Delete Contact by Email-ID \n5 - display \n6 - Exit");
		System.out.println("--------------------------------------------");
		
		int choice = in.nextInt();
		switch(choice)
		{
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			find();
			break;
		case 4:
			delete();
			break;
		case 5:
			display();
			break;
		case 6:
			x=-1;
			//exit();
			break;
		default:
			System.out.println("Enter the correct Choice !");
			
		}
		}
	}

	private static void display() throws IOException, ClassNotFoundException, ClassCastException {
		// TODO Auto-generated method stub
		//File();
		if(readFile()==true)
			System.out.println(m);
		else
			System.out.println("No contact is found");
		System.out.println("\n\n--------------------------------------------");
	}

	private static void delete() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		if(readFile()==true)
		{
		System.out.println("Enter the Contact EmailID and its info that you want to delete: ");
		String mailid=in.next();
		m.remove(mailid);
		System.out.println(m);
		addNewContact();
		}
		else
		{
			System.out.println("Sorry !! There is no data here. ");
		}
		System.out.println("\n\n--------------------------------------------");
	}

	private static boolean find() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		readFile();
		
		System.out.println("Enter which operation you want to perform: PRESS \n1 - emailId"
				+ "\n2- Email and phoneNo \n3 - Email and place");
		String s=in.next();
		
		System.out.println("Enter the Email-ID to find contact: ");
		String EmailId = in.next();
		BasicInfo bi=(BasicInfo) m.get(EmailId);
		boolean status=false;
		if(s.equals("1"))
		{
			//File();
			if(m.containsKey(EmailId))
			{
				System.out.println("Hey your contact is found: "+m.get(EmailId));
				status=true;
			}
			else
				System.out.println("No contact is found");
			return status;
		}
		else if(s.equals("2"))
		{

			System.out.println("Enter the phoneNo to find contact: ");
			Long phoneNo=in.nextLong();
			
			if(bi.phoneNo==phoneNo)
			{
				System.out.println("Hey your contact is found: "+bi);
				status=true;
			}
			else
				System.out.println("No contact is found");
		}
		else if(s.equals("3"))
		{
			System.out.println("Enter place : ");
			String place=in.next();
			if(bi.place.equals(place))
			{
				System.out.println("Hi your contact is found"+bi);
				status=true;
			}
			else
			{
				System.out.println("No contact is found");
			}
		}
		System.out.println("\n\n--------------------------------------------");
		return status;
		
	}

	
	private static boolean update() throws IOException,ClassNotFoundException
	{
		readFile();
		
		System.out.println("What do you want to update"
				+ "\n1.Update Email \n2.Update phoneNo \n3. Update place");
		String s=in.next();
		System.out.println("Enter the email-ID info that you want to UPDATE:");
		String EmailId=in.next();
		boolean status=false;
		BasicInfo bi=(BasicInfo) m.get(EmailId);
		if(s.equals("1"))
		{
			System.out.println("Enter your new mail id");
			String newmail=in.next();
			bi.EmailId=newmail;
			m.remove(EmailId);
			m.put(newmail, bi);
			System.out.println("Our Updated data: "+newmail+" "+m.get(newmail));
			addNewContact();
			status=true;
		}
		if(s.equals("2"))
		{
			System.out.println("Enter new Phone no: ");
			Long newphone=in.nextLong();
			bi.phoneNo=newphone;
			m.put(EmailId, newphone);
			System.out.println("Our Updated data: "+m.get(EmailId));
			addNewContact();
			status=true;
		}
		if(s.equals("3"))
		{
			System.out.println("Enter new place: ");
			String newplace=in.next();
			bi.place=newplace;
			m.put(EmailId, newplace);
			System.out.println("Our Updated data: "+m.get(EmailId));
			addNewContact();
			status=true;
		}
		System.out.println("\n\n--------------------------------------------");
		return status;	
	} 	
		
	private static void add() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub 
		System.out.print("Enter a valid Email-id: ");
		String EmailId = in.next();
		System.out.println();
		System.out.print("Enter a place");
		String place = in.next();
		System.out.println();
		System.out.print("Enter a valid phone no: ");
		long phoneNo = in.nextLong();
		m.put(EmailId, new BasicInfo(place, phoneNo, EmailId));
		addNewContact();
		System.out.println("Thankyou!");
		System.out.println("\n\n--------------------------------------------");
	}

	
	public static boolean readFile()
	{
		boolean status=false;
		
		try
		{
			f.createNewFile();
		}
		catch(Exception e)
		{
			
		}
		
		if(f.length() !=0)
		{
			try
			{
				fis=new FileInputStream("abc.txt");
				ois=new ObjectInputStream(fis);
				while(fis.available() !=0)
				{
					m=(HashMap)ois.readObject();
				}
				ois.close();
				fis.close();
			//	System.out.println(m);
				status=true;
			}
			catch(Exception e)
			{
				System.out.println("Error Occured "+e);
			}
		}
		return status;
	}
		
	public static boolean addNewContact()
	{
		boolean status =false;
		if(m!=null)
		{
			try
			{
				fos=new FileOutputStream("abc.txt");
				if(f.length()==0)
				{
					oos = new ObjectOutputStream(fos);
					oos.writeObject(m);
					oos.close();
				}
				else
				{
					MyObjectOutputStream oos=null;
					oos=new MyObjectOutputStream(fos);
					oos.writeObject(m);
					oos.close();
				}
				fos.close();
				fos.flush();
			}
			catch(Exception e)
			{
				System.out.println("Error Occured"+e);
			}
			status = true;
		}
		return status;
	}
}


