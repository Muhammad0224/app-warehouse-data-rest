package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Client;
import uz.pdp.appwarehouse.domain.User;
import uz.pdp.appwarehouse.domain.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Long getId();

    String getFirstName();

    String getLastName();

    String getCode();

    String getPassword();

    Set<Warehouse> getWarehouses();

    String getPhoneNumber();

    Boolean getActive();
}
