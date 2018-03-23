package entity;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;
 
/**
* The persistent class for the ConfigParam Account table.
*
*/

@Entity
@Table(name = "Account")
@XmlRootElement
public class Account {
	 private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id", unique = true, nullable = false)
     private Integer iD;

     @Column(name = "firstName", nullable = false)
     private String name;

     @Column(name = "lastName", nullable = false)
     private String lastname;
     
     @Column(name = "userName", nullable = false)
     private String username;
     
     @Column(name = "password", nullable = false)
     private String passWord;

     
     public Account() {
     }


     public Integer getAccountid() {
            return this.iD;
     }


     public void setConfigParamId(Integer valueId) {
            this.iD = valueId;
     }


     public String getName() {
            return this.name;
     }

     
     public void setName(String keyName) {
            this.name = keyName;
     }


     public String getLastName() {
            return this.lastname;
     }


     public void setLastName(String lastNameValue) {
            this.lastname = lastNameValue;
     }
     
     public String getUserName() {
    	 return this.username;
     }
     
     public void setUserName(String userNameValue) {
    	 this.username = userNameValue;
     }
     
     public String getPassword() {
    	 return this.passWord;
     }
     
     public void setPassword(String passwordValue) {
    	 this.passWord = passwordValue;
     }

}
