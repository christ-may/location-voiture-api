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
    private Long rentalId;

    @ManyToOne
    @JsonIgnore
    private Client client;


    @JsonIgnore
    @ManyToOne
    @Column(name = "id")
    private User user;


    @JsonIgnore
    @ManyToOne

    private Car car;

    private Date dateLocation;
    private Date dateBegin;
    private Date dateEnd;
    private String paymentMethod;
    private Integer price;


}
