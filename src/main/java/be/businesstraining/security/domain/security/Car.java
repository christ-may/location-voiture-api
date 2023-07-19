package be.businesstraining.security.domain.security;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CAR")
@Data
@Getter @Setter
@NoArgsConstructor

@ToString(exclude="location")
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long carId;

    private String carName;
    private  String carburant;
    private Integer nbPortes;
    private Integer nbPlacesAssis;
    private String typeBoite;
    private Integer releaseYear;
    private Integer price;
    private String available;
    private String imgUrl;

/*
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Location> locations;

    public Car(String carName, String carburant, Integer nbPortes, Integer nbPlacesAssis, String typeBoite, Integer releaseYear, Integer price, String available, String imgUrl, List<Location> locations) {
        this.carName = carName;
        this.carburant = carburant;
        this.nbPortes = nbPortes;
        this.nbPlacesAssis = nbPlacesAssis;
        this.typeBoite = typeBoite;
        this.releaseYear = releaseYear;
        this.price = price;
        this.available = available;
        this.imgUrl = imgUrl;
        //this.locations = locations;
    }*/

    public Car(String carName, String carburant, Integer nbPortes, Integer nbPlacesAssis, String typeBoite, Integer releaseYear, Integer price, String available, String imgUrl) {
        this.carName = carName;
        this.carburant = carburant;
        this.nbPortes = nbPortes;
        this.nbPlacesAssis = nbPlacesAssis;
        this.typeBoite = typeBoite;
        this.releaseYear = releaseYear;
        this.price = price;
        this.available = available;
        this.imgUrl = imgUrl;
    }
}
