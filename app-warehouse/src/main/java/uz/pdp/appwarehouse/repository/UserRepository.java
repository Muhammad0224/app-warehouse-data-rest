package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.User;
import uz.pdp.appwarehouse.projection.CustomSupplier;
import uz.pdp.appwarehouse.projection.CustomUser;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Long> {

}
