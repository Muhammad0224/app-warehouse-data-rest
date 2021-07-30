package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Client;

@Projection(types = Client.class)
public interface CustomSupplier {
    Long getId();

    String getName();

    String getPhoneNumber();

    Boolean getActive();
}
