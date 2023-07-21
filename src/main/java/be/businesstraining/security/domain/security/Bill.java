package be.businesstraining.security.domain.security;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Bill")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Bill {

    /* Clé étrangère vers la table User */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "id")
    private List<User> users;

    private Date date;
    private double total;
    private boolean isPaid;


}
