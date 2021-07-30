package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.*;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Long getId();

    Timestamp getReceiveDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();
}
