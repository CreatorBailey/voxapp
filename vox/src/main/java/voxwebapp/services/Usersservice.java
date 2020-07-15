package voxwebapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import voxwebapp.models.Site;
import voxwebapp.models.Users;
import voxwebapp.repositories.Siterepo;
import voxwebapp.repositories.Usersrepo;

@Service
public class Usersservice {

    @Autowired
    private Usersrepo usersrepo;

    @Autowired
    private Siterepo siterepo;

    public Site findByEmail(Site site){
        Site site1 = siterepo.findByEmail(site.getEmail());
        if(site1 != null && site1.getPswd() != null && site1.getPswd().equals(site.getPswd())){
            return site1;
        }
        else return null;
    }
    public Page<Users> getAllUsersByPage(Pageable pageable){
        return usersrepo.findAll(pageable);
    }
    public Site update(Site site, String id){
       Site address = siterepo.getOne(id);
        if (site.getEmail()!=null) {
            address.setEmail(site.getEmail());
        }if (site.getEmail()!=null) {
            address.setEmail(site.getEmail());
        }if (site.getPswd()!=null) {
            address.setPswd(site.getPswd());
        }
        return siterepo.save(address);
    }
    public Users getById(String identifier){
        return usersrepo.findByIdentifier(identifier);
    }


}
