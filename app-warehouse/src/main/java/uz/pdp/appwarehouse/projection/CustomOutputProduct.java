package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.*;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
