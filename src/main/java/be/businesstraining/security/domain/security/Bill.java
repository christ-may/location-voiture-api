package be.businesstraining.security.domain.security;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Bill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bill {

    /* Clé étrangère vers la table User */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private Date date;
    private double total;
    private boolean isPaid;


}
