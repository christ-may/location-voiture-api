package be.businesstraining.security.domain.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "RENTAL")
@NoArgsConstructor
@Getter
@Setter
@Data
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    /*@JsonIgnore
    @OneToOne
    private User user;


    @JsonIgnore
    @OneToOne
    private Car car;
*/
    @OneToOne
    private Accident accident;

    private Date dateLocation;
    private Date dateBegin;
    private Date dateEnd;
    private String paymentMethod;
    private Integer price;


}
