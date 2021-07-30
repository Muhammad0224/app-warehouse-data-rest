package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.Supplier;
import uz.pdp.appwarehouse.projection.CustomClient;
import uz.pdp.appwarehouse.projection.CustomSupplier;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
