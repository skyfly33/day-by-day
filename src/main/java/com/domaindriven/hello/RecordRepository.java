package com.domaindriven.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jerry on 2016-01-26.
 */
public interface RecordRepository extends CrudRepository<Record,Long> {
    Record findById(Long Id);
}
