import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;

public class ContactInfoApp
{
	static HashMap<String,BasicInfo> m = new HashMap<>();
	static String EmailId;
	static int phoneNo;
	static String place;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static FileInputStream fis;
	static ObjectInputStream ois;
	private static File f=new File("abc.txt");
	static Scanner in = new Scanner(System.in);
	static List<BasicInfo> showDataList;
	
	
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

	
	
	private static String delete() {
		// TODO Auto-generated method stub
		if (readFile()) {
            whatChoice("Delete");
            String enteredMailId = showDataList.get(0).EmailId;
            m.remove(enteredMailId);

            for (Entry<String, BasicInfo> entry : m.entrySet()){
                System.out.println("key = " + entry.getKey()+" Value = "+ entry.getValue() );
            }
            addNewContact();

        } else {
            System.out.println("No data is available! please store the data first");
        }
        return "data deleted";
	}



	private static void add() throws IOException, ClassNotFoundException 
	{
		// TODO Auto-generated method stub 
		System.out.print("Enter a valid Email-id: ");
		String EmailId = in.next();
		System.out.println();
		System.out.print("Enter a place");
		String place = in.next();
		System.out.println();
		System.out.print("Enter a valid phone no: ");
		Long phoneNo = in.nextLong();
		m.put(EmailId, new BasicInfo(EmailId,place, phoneNo));
		addNewContact();
		System.out.println("Thankyou!");
		System.out.println("\n\n--------------------------------------------");
	}
	
	private static boolean update() throws IOException,ClassNotFoundException
	{
		if(readFile()==true)
		{
			boolean bool=true;
			
			while(bool)
			{
				whatChoice("Update");
				String MailId=showDataList.get(0).EmailId;
				showDataList=null;
				BasicInfo updateData = m.get(MailId);
				System.out.println(updateData);

	             System.out.println("what do want update");
	             System.out.println("1. update mail id");
	             System.out.println("2. update place name");
	             System.out.println("3. update phone no");
	             System.out.println("====================");
	                System.out.print("enter your option: ");
	                int updateOption = in.nextInt();
	                in.nextLine();
	                switch (updateOption) {
	                    case 1:
	                        System.out.println("your old mail id is \"" + updateData.EmailId + "\"");
	                        System.out.println("enter your new mail id");
	                        String newUpdateMailId = in.nextLine();
	                        updateData.EmailId = newUpdateMailId;
	                        System.out.println("updated mail id is : " + updateData.EmailId);
	                        m.remove(MailId);
	                        m.put(newUpdateMailId, updateData);
	                        System.out.println("your updated data : " + m.get(newUpdateMailId));
	                        addNewContact();
	                        break;
	                    case 2:

	                        System.out.println("your old place name is \"" + updateData.place + "\"");
	                        System.out.println("enter your new name");
	                        String newUpdatename = in.nextLine();
	                        updateData.place = newUpdatename;
	                        System.out.println("updated name is : " + updateData.place);
	                        m.put(MailId, updateData);
	                        System.out.println("your updated data : " + m.get(MailId));
	                        addNewContact();
	                        break;
	                    case 3:

	                        System.out.println("your old phone no is \"" + updateData.phoneNo + "\"");
	                        System.out.println("enter your new phone");
	                        Long newUpdatePhoneNo = in.nextLong();
	                        in.nextLine();
	                        updateData.phoneNo = newUpdatePhoneNo;
	                        System.out.println("updated name is : " + updateData.phoneNo);
	                        m.put(MailId, updateData);
	                        System.out.println("your updated data : " + m.get(MailId));
	                        addNewContact();
	                        break;
	            
	                    default:
	                        System.out.println("Your option was not correct! please enter correctly");
	                        break;
	                }

	                System.out.println("Do you want continue enter \"true\" or \"false\" : ");
	                bool = in.nextBoolean();
	            }
	        } 
		else {
	            System.out.println("No data is available! please store the data first");
	        }

	        return true;
	}

    public static String whatChoice(String forWhat)
    {
        System.out.println("\n====================");
        System.out.println(forWhat+" the data by");
        System.out.println("1. Email id : ");
        System.out.println("2. phone no : ");
        System.out.println("3. place name : ");
        System.out.println("====================");
        System.out.print("enter your option: ");
        int selectOption = in.nextInt();
        in.nextLine();

        String choice = "";


        switch (selectOption) 
        {
            case 1:
                searchByMail();
                break;
            case 2:
                searchByPhone();
                break;
            case 3:
                searchByPlace();
                break;
            default:
                System.out.println("Your option was not correct! please enter correctly");
                break;
        }

        return choice;
    }

	public static void display() 
	{
		if(readFile()==true)
		{
			System.out.println("Displaying...");
			System.out.println(m.values());
		}
		else
		{
			System.out.println("Hey there is no contact found ");
		}
	}
	
	private static String find() throws IOException, ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		
        if (readFile()) {
        	boolean bool = true;
            while (bool) {
                whatChoice("Search");

                if (showDataList.size()!=0) {
                    System.out.println("Your searched data : " + showDataList);
                } else {
                    System.out.println("No such data found");
                }
                System.out.println("Do you want continue enter \"true\" or \"false\" : ");
                bool = in.nextBoolean();
            }

        } else {
            System.out.println("No data is available! please store the data first");
        }

        return "Done";
	}

    public static List searchByPlace()
    {
        System.out.println("Enter the place name : ");
        String enteredName = in.nextLine();
        showDataList=new ArrayList<>();
        showDataList = m.values().stream().filter(BasicInfo -> BasicInfo.place.equals(enteredName)).collect(Collectors.toList());
        return showDataList;
    }
	public static List searchByPhone() {
// TODO Auto-generated method stub
	       System.out.println("Enter the phone no : ");
	        Long enteredNumber = in.nextLong();
	        in.nextLine();
	        showDataList=new ArrayList<>();
	        showDataList = m.values().stream().filter(BasicInfo -> BasicInfo.phoneNo.equals(enteredNumber)).collect(Collectors.toList());
	        return showDataList;
	}

	public static List searchByMail()
	{
		System.out.println("Enter the Mail: ");
		String EmailId=in.nextLine();
		//showDataList.clear();
		showDataList=new ArrayList<>();
		showDataList.add(m.get(EmailId));
		return showDataList;
	}	
	
	static class MyObjectOutputStream extends ObjectOutputStream 
	{
		 
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
	
	//Serializing
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
	
	//Deserializing
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
		
}
