package io.zipcoder.quickpoll.repository;

import org.springframework.data.repository.CrudRepository;
import io.zipcoder.quickpoll.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {

}
