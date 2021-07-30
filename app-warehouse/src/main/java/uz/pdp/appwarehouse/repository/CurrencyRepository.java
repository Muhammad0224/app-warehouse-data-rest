package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.appwarehouse.domain.Currency;
import uz.pdp.appwarehouse.projection.CustomCurrency;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "currency", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
