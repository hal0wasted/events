package ch.wisv.events.repository;

import ch.wisv.events.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Event repository.
 */
public interface EventRepository extends CrudRepository<Event, Long> {

    List<Event> findByTitle(String title);

    List<Event> findByEndAfter(LocalDateTime start);

    List<Event> findByRegistrationStartBeforeAndRegistrationEndAfter(LocalDateTime registrationStart, LocalDateTime
            registrationEnd);
}
