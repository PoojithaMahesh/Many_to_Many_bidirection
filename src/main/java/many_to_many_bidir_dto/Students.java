package many_to_many_bidir_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Students {
    @Id
	private int id;
	private String name;
	private int phone;
	@ManyToMany
	@JoinTable(joinColumns= {@JoinColumn(name="id")},inverseJoinColumns = {@JoinColumn(name="c_id")})
	private List<Courses> students;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public List<Courses> getList() {
		return students;
	}
	public void setList(List<Courses> list) {
		this.students = list;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", phone=" + phone + ", list=" + students + "]";
	}
	
}
