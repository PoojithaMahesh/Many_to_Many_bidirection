package many_to_many_bidir_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	private int c_id;
	private String name;
	private String durations;
	@ManyToMany(mappedBy = "students")
	
	List<Students> courses;
	public int getId() {
		return c_id;
	}
	public void setId(int id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDurations() {
		return durations;
	}
	public void setDurations(String durations) {
		this.durations = durations;
	}
	public List<Students> getList() {
		return courses;
	}
	public void setList(List<Students> list) {
		this.courses = list;
	}
	@Override
	public String toString() {
		return "Courses [id=" + c_id + ", name=" + name + ", durations=" + durations + ", list=" + courses+ "]";
	}
	

}
