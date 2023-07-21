package be.businesstraining.security.domain.security;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.loader.plan.exec.process.spi.CollectionReferenceInitializer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ADRESS")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AdressID;

    @OneToMany
    @Column(name = "id")
    private List<User> users;

    private String Street;

    private Integer number;

    private String city;

    private String country;

}
