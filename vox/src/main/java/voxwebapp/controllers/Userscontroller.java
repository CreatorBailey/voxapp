package voxwebapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import voxwebapp.models.Site;
import voxwebapp.models.Users;
import voxwebapp.services.Usersservice;

@RestController
public class Userscontroller {
    @Autowired
    Usersservice usersservice;

    @PostMapping("/users/login")
    ResponseEntity<?> findByEmail(@RequestBody Site site){
        Site site1 = usersservice.findByEmail(site);
        if(site1 == null){
            return new ResponseEntity<>("User login failed", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("User login successful", HttpStatus.ACCEPTED);
    }
    @GetMapping("/users/")
    ResponseEntity<?> getAllUsers(Pageable pageable){
        return new ResponseEntity<>(usersservice.getAllUsersByPage(pageable), HttpStatus.ACCEPTED);
    }

    @PutMapping("/site/{id}")
    ResponseEntity<?> updateUser(@RequestBody Site site, @PathVariable String id){
        return new ResponseEntity<>(usersservice.update(site,id),HttpStatus.OK);
    }


    @GetMapping("/users/{identifier}")
    ResponseEntity<?>getById(@PathVariable String identifier){
        return new ResponseEntity<>(usersservice.getById(identifier),HttpStatus.OK);
    }
}
