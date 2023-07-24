package be.businesstraining.security.controller;

import be.businesstraining.security.domain.security.Penality;
import be.businesstraining.security.domain.security.Rental;
import be.businesstraining.security.repository.IPenalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class PenalityRestController {

    private IPenalityRepository penalityRepository;

    @Autowired
    public PenalityRestController(IPenalityRepository penalityRepository) {
        this.penalityRepository = penalityRepository;
    }


    @GetMapping("/penality")
    public ResponseEntity<Iterable<Penality>> getAllPenality(){

        return ResponseEntity.ok(penalityRepository.findAll());
    }

    @RequestMapping("/penality/{id}")
    public ResponseEntity<Penality> findpenalityById(@PathVariable Long id){
        Optional<Penality> penalityOptional = penalityRepository.findById(id);
        return (penalityOptional.isPresent())?
                new ResponseEntity<>(penalityOptional.get(), HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/penality")
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Penality> addPenality(@RequestBody Penality penality){
        return new ResponseEntity(penalityRepository.save(penality), HttpStatus.CREATED);
    }

    @PutMapping("penality/{id}")
    public ResponseEntity<Penality> updatePenality(@PathVariable Long id, @RequestBody Penality updatedPenality) {
        Optional<Penality> penalityOptional = penalityRepository.findById(id);
        if (penalityOptional.isPresent()) {
            Penality penality = penalityOptional.get();
            penality.setPenalityType(updatedPenality.getPenalityType());
            penality.setPrice(updatedPenality.getPrice());

            penalityRepository.save(penality);

            return ResponseEntity.ok(penality);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/penality/{id}")
    public ResponseEntity<Penality> deletePenaltyById(@PathVariable (value = "id") Long myId) {

        Optional<Penality> penality = penalityRepository.findById(myId);
        if (!penality.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            penalityRepository.deleteById(myId);
            return new ResponseEntity<Penality>(HttpStatus.ACCEPTED);
        }
    }
}
