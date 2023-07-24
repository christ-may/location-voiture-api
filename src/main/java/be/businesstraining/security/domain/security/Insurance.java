package be.businesstraining.security.domain.security;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "INSURANCE")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "insurance")
    private List<Car> cars;

    private String compagnyName;
    private Integer insuranceNumber;
    private Date starDate;
    private Date endDate;

}
