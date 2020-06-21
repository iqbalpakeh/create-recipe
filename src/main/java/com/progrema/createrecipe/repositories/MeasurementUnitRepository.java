package com.progrema.createrecipe.repositories;

import com.progrema.createrecipe.domain.MeasurementUnit;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MeasurementUnitRepository extends CrudRepository<MeasurementUnit, Long> {

    Optional<MeasurementUnit> findByDescription(String description);

}
