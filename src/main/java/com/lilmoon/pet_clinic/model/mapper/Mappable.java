package com.lilmoon.pet_clinic.model.mapper;

/**
 *
 * @param <E> entity type
 * @param <D> DTO type
 */
public interface Mappable<E, D> {
    D mapToDTO(E entity);

    E mapToEntity(D dto);
}
