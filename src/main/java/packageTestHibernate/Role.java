package packageTestHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity @Table(name="t_roles")
public class Role {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	private int idRole;
	private String roleName;
	
	@ManyToMany
	@JoinTable(name="t_users_roles_associations",
		joinColumns = @JoinColumn(name="idRole"),
		inverseJoinColumns = @JoinColumn (name="idUser"))
	
	private List<User> users = new ArrayList<User>();
	public Role() {
	};
	public Role(int idRole, String roleName) {
		this.idRole = idRole;
		this.roleName = roleName;
	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Role [ roleName=" + roleName +  "]";
	}

}
