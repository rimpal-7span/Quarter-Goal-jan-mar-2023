package collection;

public class Employee
{
	private int eid;

//	@Override
//	public boolean equals(Object o)
//	{
//		if (this == o)
//			return true;
//		if (!(o instanceof Employee))
//			return false;
//		Employee employee = (Employee) o;
//		return getEid() == employee.getEid() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSalary(),
//				employee.getSalary());
//	}
//
//	@Override
//	public int hashCode()
//	{
//		return Objects.hash(getEid(), getName(), getSalary());
//	}

	@Override
	public String toString()
	{
		return "Employee{" + "eid=" + eid + ", name='" + name + '\'' + ", salary=" + salary + '}';
	}

	private String name;
	private Double salary;

	public Employee(int i, String abc, Double i1)
	{
		this.eid=i;
		this.name = abc;
		this.salary= i1;

	}

	public int getEid()
	{
		return eid;
	}

	public void setEid(int eid)
	{
		this.eid = eid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Double getSalary()
	{
		return salary;
	}

	public void setSalary(Double salary)
	{
		this.salary = salary;
	}

}
