package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.InputProduct;
import uz.pdp.appwarehouse.projection.CustomCategory;
import uz.pdp.appwarehouse.projection.CustomInputProduct;

import java.util.List;

@RepositoryRestResource(path = "input_product", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {

}
