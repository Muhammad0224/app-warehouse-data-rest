package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.Input;
import uz.pdp.appwarehouse.projection.CustomCategory;
import uz.pdp.appwarehouse.projection.CustomInput;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "input", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Long> {
}
