package be.businesstraining.security.domain.security;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "NOTIFICATION")
@Getter
@Setter
@Data
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @Column(name = "id") // Nom de la colonne pour la clé étrangère
    private List<User> users;

    private String message;
    private boolean isRead;
}
