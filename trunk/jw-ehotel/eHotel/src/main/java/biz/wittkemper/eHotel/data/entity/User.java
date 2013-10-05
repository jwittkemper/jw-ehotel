package biz.wittkemper.eHotel.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "hotelUser")
public class User implements Serializable {

	private static final long serialVersionUID = -1403837951423403439L;

	@Id
	@Column(unique = true, length = 20)
	@NotEmpty
	String username;

	String name;
	String vorname;

	@Column(length = 20)
	@NotEmpty
	String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
