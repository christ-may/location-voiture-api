package be.businesstraining.security.domain.security;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "ACCIDENT")
public class Accident {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*@OneToOne(mappedBy = "accident")
    private Rental rental;*/


    private Date dateAccident;

    private String description;

    private String Place;





}
