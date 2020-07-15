package voxwebapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import voxwebapp.models.Site;
import voxwebapp.models.Users;

public interface Siterepo extends JpaRepository<Site, String> {
    Site findByEmail(String email);
}
