package mvcdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import mvcdemovalidation.CorseCode;

public class StudentModel {
	@NotNull(message="isRequired")
	@Size(min=1,message="isRequired")
	private String firstName;
	private String lastName;
	private String country;
	private String[] check;
	private String sex;
	@NotNull(message="isRequired")
	@Size(min=8,message="must have 8 characters")
	private String password;
	@Min(value=0,message="the minimum passes are zero")
	@Max(value=5,message="the maximum passes are 5")
	private int passes;
	@NotNull(message="isRequired")
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="should have 5 characters and a-z ,A-Z,0-9 format")
	private String postalCode;
    @CorseCode(value="AVS",message="Course must start with AVS")
	private String courseCode;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getPasses() {
		return passes;
	}
	public void setPasses(int passes) {
		this.passes = passes;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getCheck() {
		return check;
	}
	public void setCheck(String[] check) {
		this.check = check;
	}
	private LinkedHashMap<String,String> comboMap;
	
	public StudentModel(){
		comboMap = new LinkedHashMap<>();
		comboMap.put("Ind","India");
		comboMap.put("Sri", "Srilanka");
		comboMap.put("AUS", "Australia");
		comboMap.put("Sa", "Southafrica");
	}
	public LinkedHashMap<String, String> getComboMap() {
		return comboMap;
	}
	public void setComboMap(LinkedHashMap<String, String> comboMap) {
		this.comboMap = comboMap;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	

}
