public class Department {
	private String departmentId;
	private String departmentName, location;
	public Department(String departmentId,String departmentName,String location)
	{
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "departmentId=" + departmentId + ",\n departmentName=" + departmentName + ",\n location="
				+ location;
	}
}