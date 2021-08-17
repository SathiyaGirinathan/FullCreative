import java.io.Serializable;

public class BasicInfo implements Serializable
{
	long phoneNo;
	String place;
	String EmailId;
	
	BasicInfo( String place, long phoneNo, String EmailId)
	{
		this.phoneNo=phoneNo;
		this.EmailId=EmailId;
		this.place=place;
	}
	
	public String toString()
	{
		return phoneNo+" "+place;
	}
}