package be.businesstraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class LocationVoitureApiApplication extends SpringBootServletInitializer {

    //private static final Logger log = LoggerFactory.getLogger(LocationVoitureApiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(LocationVoitureApiApplication.class, args);
        
    }
/*
    @Bean
    public CommandLineRunner demo(ICarRepository CarRepo, IClientRepository clientRepo, ILocationRepository locationRepo){
        return (args) -> {
            // save a few customers
            Car car1 = new Car("Mercedes class A"
                    , "essence"
                                , 5
                                , 5
                                , "Manuelle"
                                , 2020
                                , 100
                                , "Dispo"
                                , "https://www.mercedes-benz.lu/fr/passengercars/mercedes-benz-cars/models/a-class/hatchback-w177/design/equipment-detail/night/_jcr_content/par/productinfotextimage/media2/slides/videoimageslide_78f0/image.MQ2.12.20190910205822.jpeg"
                                );
            Car car2 = new Car("Opel Astra"
                    , "Diesel"
                    , 3
                    , 5
                    , "Manuelle"
                    , 2018
                    , 40
                    , "Dispo"
                    , "https://photos.tf1.fr/940/531/opel-astra-2015-1-0c6054-0@1x.jpg"
            );
            Car car3 = new Car("Toyota Yaris"
                    , "Diesel"
                    , 5
                    , 5
                    , "Automatique"
                    , 2019
                    , 50
                    , "Dispo"
                    , "https://car-recalls.eu/wp-content/uploads/2020/04/Toyota-Yaris-2018-recall-dc-dc-converter-failure.jpg"
            );


            Client c1 = new Client("christ","Mamay",new Date(21/12/1987),"rue christ 55"
                    ,789456,new Date(21/01/1987),"azert",null);

            Client c2 = new Client("julien","dunia",new Date(13/12/1987),"rue jul 55"
                    ,789456,new Date(21/12/1987),"azert",null);

            Location loc1 = new Location(c1,car1, new Date(11/11/2020), new Date(20/12/2020), new Date(20/01/2022) ,"card",100);
            Location loc2 = new Location(c1,car2, new Date(10/10/2020),new Date(20/12/2020),new Date(20/01/2022) ,"cash",35);
            Location loc3 = new Location(c2,car3, new Date(5/5/2020),new Date(20/12/2020),new Date(20/01/2022) ,"card",100);

            //List<Location> listLoca = new ArrayList<>();
            //listLoca.add(loc1);

            //c1.setLocations((listLoca));
            c1.setLocations(new ArrayList<>(Arrays.asList(loc1,loc2)));
            c2.setLocations(new ArrayList<>(Arrays.asList(loc3)));

            /*car1.setLocations(new ArrayList<>(Arrays.asList(loc1)));

            car2.setLocations(new ArrayList<>(Arrays.asList(loc2)));
            car3.setLocations(new ArrayList<>(Arrays.asList(loc3)));*/

/*
            CarRepo.save(car1);
            CarRepo.save(car2);
            CarRepo.save(car3);

            locationRepo.save(loc1);
            clientRepo.save(c1);

  */
            /*CarRepo.saveAll(Arrays.asList(car1,car2,car3));
            clientRepo.saveAll(Arrays.asList(c1,c2));
            locationRepo.saveAll(Arrays.asList(loc1,loc2,loc3));







            log.info("Voiture");
            for(Car c : CarRepo.findAll()){
                log.info(car1.getCarName());
            }

            log.info("Client");
            for(Client c : clientRepo.findAll()) {
                log.info(c.getFisrtName());
            }


            log.info("Location");
            for(Location c : locationRepo.findAll()){
                log.info(c.getPaymentMethod());
            }

        };
    }*/
}