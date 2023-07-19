package be.businesstraining.security.domain.security;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "CLIENT")
@NoArgsConstructor
@Data
@ToString(exclude="location")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String lastName;
    private  String firstName;
   // private  Date birthDay;
   // private String street;
    //private Integer fone;
    //private Date DateInscription;
    private String password;
    private String gender;
    private String email;

    /*@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Location> locations;

    public Client(String lastName, String firstName, Date birthDay, String street, Integer fone, Date dateInscription, String password, List<Location> locations) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.street = street;
        this.fone = fone;
        DateInscription = dateInscription;
        this.password = password;
        this.locations = locations;
    }*/

    public Client(String username, String lastName, String firstName, String password, String gender, String email) {
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.gender = gender;
        this.email = email;
    }
}
