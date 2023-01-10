
package serialization;

import java.io.Serializable;

public class Address implements Serializable
{
	public Integer house_no;
	public String state;
	public String city;

	public Address(Integer house_no, String state, String city)
	{
		this.house_no = house_no;
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString()
	{
		return "Address{" + "house_no=" + house_no + ", state='" + state + '\'' + ", city='" + city + '\'' + '}';
	}
}
