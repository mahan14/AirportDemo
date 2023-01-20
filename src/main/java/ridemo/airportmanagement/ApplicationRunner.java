package ridemo.airportmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ridemo.airportmanagement.db.FlightInformationRepository;
import ridemo.airportmanagement.domain.FlightInformation;
import ridemo.airportmanagement.domain.FlightPrinter;

import java.util.List;

/*
This component will be the main entry point for
our use cases. It should get executed after the seeding
process
 */

@Service
public class ApplicationRunner implements CommandLineRunner {
    private FlightInformationRepository flightRepository;

    public ApplicationRunner(FlightInformationRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(String... args) {
        List<FlightInformation> flights = this.flightRepository.findAll();
        FlightPrinter.print(flights);
    }
}
