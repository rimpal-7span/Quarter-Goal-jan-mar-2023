package collection;

public class GroupInForEmployee
{
	String name;
	Employee employee;
	String CompanyName;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getCompanyName()
	{
		return CompanyName;
	}

	public void setCompanyName(String companyName)
	{
		CompanyName = companyName;
	}

	public GroupInForEmployee(String name, Employee employee, String companyName)
	{
		this.name = name;
		this.employee = employee;
		CompanyName = companyName;
	}
}
