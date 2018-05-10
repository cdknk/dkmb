package dkmb.bean;

import java.util.Date;

import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
//	@Id
//	@GeneratedValue//自增
	@Min(value = 1,message = "id不能小于1")//约束
	private int id;
	private String name;
//	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
