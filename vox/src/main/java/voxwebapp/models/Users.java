package voxwebapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users extends Site {

    @Id
    @Column(name = "identifier")
   private String identifier;


    @Column(name = "accounts")
   private String accounts;

    @Column(name = "group")
    private String group;

    @Column(name = "job")
    private String job;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "dateofbirth")
    private String dateofbirth;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "jail_time")
    private Integer jailTime;


    public Users(){

    }

    public Users(String identifier, String accounts, String group, String job, String firstname,
                 String lastname, String dateofbirth, String phoneNumber, Integer jailTime) {
        this.identifier = identifier;
        this.accounts = accounts;
        this.group = group;
        this.job = job;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.phoneNumber = phoneNumber;
        this.jailTime = jailTime;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getAccounts() {
        return accounts;
    }

    public String getGroup() {
        return group;
    }

    public String getJob() {
        return job;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getJailTime() {
        return jailTime;
    }

}
