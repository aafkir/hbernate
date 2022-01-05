package packageTestHibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table(name="t_users")
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;
	private String login;
	private String password;
	private int connectionNumber;


	@ManyToMany
	@JoinTable(name="t_users_roles_associations",
		joinColumns = @JoinColumn(name="idUser"),
		inverseJoinColumns = @JoinColumn (name="idRole"))
	private List<Role> roles = new ArrayList<Role>();

	public User() {};
	public User(int idUser, String login, String password, int connectionNumber, List<Role> roles) {
		this.idUser = idUser;
		this.login = login;
		this.password = password;
		this.connectionNumber = connectionNumber;
		this.roles = roles;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getConnectionNumber() {
		return connectionNumber;
	}
	public void setConnectionNumber(int connectionNumber) {
		this.connectionNumber = connectionNumber;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", login=" + login + ", password=" + password + ", connectionNumber="
				+ connectionNumber + ", roles=" + roles + "]";
	}
	
	
	
	
	
	
	

}
