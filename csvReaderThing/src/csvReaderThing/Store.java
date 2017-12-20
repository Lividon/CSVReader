package csvReaderThing;

public class Store {
	private String name;
	private String address;
	private String City;
	private String state; //no clue
	private String date;
	private String type1;
	private String type2;
	
	public Store(String name, String address, String City, String state, String date, String type1, String type2)
	{
		this.name = name;
		this.address = address;
		this.City = City;
		this.state = state;
		this.date = date;
		this.type1 = type1;
		this.type2 = type2;
	}
	public String ToString()
	{
		return("Store:" + name + "With an Addres of" + address + ". In the city of" + City);
	}

}
