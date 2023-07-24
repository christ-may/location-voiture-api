package be.businesstraining.security.domain.security;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
@NoArgsConstructor
@Getter
@Setter
@Data
public class User {

    @Id
    //@Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    //@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;

    @OneToOne
    private Adress adress;



    //@Column(name = "USERNAME", length = 50, unique = true)

    private String username;

    //@Column(name = "PASSWORD", length = 100)

    private String password;

    //@Column(name = "FIRSTNAME", length = 50)

    private String firstname;

    //@Column(name = "LASTNAME", length = 50)

    private String lastname;

    //@Column(name = "EMAIL", length = 50)

    private String email;

    //@Column(name = "ENABLED")

    private Boolean enabled;

    private Integer foneNumber;

    //@Column(name = "LASTPASSWORDRESETDATE")
    @Temporal(TemporalType.TIMESTAMP)

    private Date lastPasswordResetDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "USER_AUTHORITY",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID")})
    private List<Authority> authorities;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.enabled = true;
    }


    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }
}