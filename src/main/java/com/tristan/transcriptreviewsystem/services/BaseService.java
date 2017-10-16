package com.tristan.transcriptreviewsystem.services;

import java.util.List;

/**
 * Created by Tristan on 2017/09/05.
 */
public interface BaseService<E, ID> {

    public E create(E entity);
    public E read(ID value);
    public E update(E entity);
    public void delete(ID value);

    public List<E> findAll();

}
