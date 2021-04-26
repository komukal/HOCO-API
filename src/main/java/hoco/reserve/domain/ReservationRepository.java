package hoco.reserve.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface ReservationRepository extends CrudRepository<Reservation, Long>{

}
