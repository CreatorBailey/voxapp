package voxwebapp.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import voxwebapp.models.Users;

public interface Usersrepo extends JpaRepository<Users, String> {

    Users findByIdentifier(String identifier);

    Page<Users> findAll(Pageable pageable);


}
