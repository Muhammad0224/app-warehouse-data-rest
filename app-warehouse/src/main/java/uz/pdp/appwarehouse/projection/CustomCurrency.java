package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Currency;
import uz.pdp.appwarehouse.domain.Measurement;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Long getId();

    String getName();

    Boolean getActive();
}
