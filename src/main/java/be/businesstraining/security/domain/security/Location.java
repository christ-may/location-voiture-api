package be.businesstraining.security.domain.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "location")
@NoArgsConstructor

@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @ManyToOne
    @JsonIgnore
    private Client client;


    @JsonIgnore
    @ManyToOne
    private User user;


    @JsonIgnore
    @ManyToOne

    private Car car;

    private Date dateLocation;
    private Date dateBegin;
    private Date dateEnd;
    private String paymentMethod;
    private Integer price;

    public Location(Client client, Car car, Date dateLocation, Date dateBegin, Date dateEnd, String paymentMethod, Integer price) {
        this.client = client;
        this.car = car;
        this.dateLocation = dateLocation;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.paymentMethod = paymentMethod;
        this.price = price;
    }

    public Location(User user, Date dateLocation, Date dateBegin, Date dateEnd, String paymentMethod, Integer price) {
        this.user = user;
        this.dateLocation = dateLocation;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.paymentMethod = paymentMethod;
        this.price = price;
    }
}
