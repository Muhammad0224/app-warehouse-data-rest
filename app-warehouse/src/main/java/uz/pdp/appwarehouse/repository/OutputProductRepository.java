package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.OutputProduct;
import uz.pdp.appwarehouse.projection.CustomInputProduct;
import uz.pdp.appwarehouse.projection.CustomOutputProduct;

import java.util.List;

@RepositoryRestResource(path = "output_product", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {

}
