package io.zipcoder.quickpoll.repository;

import org.springframework.data.repository.CrudRepository;
import io.zipcoder.quickpoll.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
