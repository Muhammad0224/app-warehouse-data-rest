package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Category;
import uz.pdp.appwarehouse.domain.Currency;

@Projection(types = Category.class)
public interface CustomCategory {
    Long getId();

    String getName();

    Category getParent();

    Boolean getActive();
}
