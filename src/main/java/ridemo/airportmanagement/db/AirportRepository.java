package ridemo.airportmanagement.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ridemo.airportmanagement.domain.Airport;

@Repository
public interface AirportRepository extends
        MongoRepository<Airport, String> {
}
