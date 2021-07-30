package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.domain.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Long getId();

    String getName();

//    Boolean getActive();
}
