package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.Warehouse;
import uz.pdp.appwarehouse.projection.CustomSupplier;
import uz.pdp.appwarehouse.projection.CustomWarehouse;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "warehouse", excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {

}
