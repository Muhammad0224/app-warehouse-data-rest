package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Category;
import uz.pdp.appwarehouse.domain.Measurement;
import uz.pdp.appwarehouse.domain.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Long getId();

    String getName();

    Category getCategory();

    Boolean getActive();

    Measurement getMeasurement();

    Integer getCode();
}
