package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Client;
import uz.pdp.appwarehouse.domain.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Long getId();

    String getName();

    Boolean getActive();
}
