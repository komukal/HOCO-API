package hoco.reserve.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface RoomRepository extends CrudRepository<Room, Long> {

}
