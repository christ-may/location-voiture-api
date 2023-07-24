package be.businesstraining.security.controller;

import be.businesstraining.security.JwtTokenUtil;
import be.businesstraining.security.JwtUser;
import be.businesstraining.security.domain.security.Car;
import be.businesstraining.security.domain.security.Client;
import be.businesstraining.security.domain.security.User;
import be.businesstraining.security.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@CrossOrigin( origins = "*")
public class UserRestController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;


    private IUserRepository userRepo;

    @Autowired
    public UserRestController(IUserRepository userRepo) {
        this.userRepo = userRepo;
    }

   /* @GetMapping("/user")
    public Iterable<User> getAllUser(){
        return userRepo.findAll();
    }*/


    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable(name = "id") Long id){
        return userRepo.findById(id).orElse(null);
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user){

        return new ResponseEntity (userRepo.save(user), HttpStatus.CREATED);

    }

    @PutMapping("user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setUsername(updatedUser.getUsername());
            user.setFirstname(updatedUser.getFirstname());
            user.setLastname(updatedUser.getLastname());
            user.setEmail(updatedUser.getEmail());
            user.setFoneNumber(updatedUser.getFoneNumber());
            userRepo.save(user);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<User> deleteUserById(@PathVariable (value = "id") Long myId) {

        Optional<User> user = userRepo.findById(myId);
        if (!user.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            userRepo.deleteById(myId);
            return new ResponseEntity<User>(HttpStatus.ACCEPTED);
        }
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public JwtUser getAuthenticatedUser(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader).substring(7);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }


}
