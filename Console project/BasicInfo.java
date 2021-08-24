import java.io.Serializable;

public class BasicInfo implements Serializable
{
	Long phoneNo;
	String place;
	String EmailId;
	
	public BasicInfo(String EmailId, String place, Long phoneNo)
	{
		this.phoneNo=phoneNo;
		this.EmailId=EmailId;
		this.place=place;
	}
	
	public String toString()
	{
		return "EmailId: "+ EmailId+", Phone No: "+phoneNo+", Place: "+place;
	}
}