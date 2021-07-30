package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.*;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Long getId();

    Timestamp getSoldDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();
}
