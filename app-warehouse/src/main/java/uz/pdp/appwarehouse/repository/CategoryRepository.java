package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.Category;
import uz.pdp.appwarehouse.projection.CustomCategory;
import uz.pdp.appwarehouse.projection.CustomCurrency;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
