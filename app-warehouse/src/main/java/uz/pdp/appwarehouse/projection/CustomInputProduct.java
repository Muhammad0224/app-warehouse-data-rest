package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Category;
import uz.pdp.appwarehouse.domain.Input;
import uz.pdp.appwarehouse.domain.InputProduct;
import uz.pdp.appwarehouse.domain.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
