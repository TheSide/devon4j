package com.devonfw.example.general.common.api;

import com.devonfw.module.basic.common.api.entity.PersistenceEntity;

/**
 * This is the abstract interface for a {@link PersistenceEntity} of this application. We are using {@link Long} for all
 * {@link #getId() primary keys}.
 */
public abstract interface TestApplicationEntity extends PersistenceEntity<Long> {

}
