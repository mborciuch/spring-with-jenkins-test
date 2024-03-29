package com.baeldung.common.persistence.event;

import org.springframework.context.ApplicationEvent;

import com.baeldung.common.interfaces.IWithName;
import com.google.common.base.Preconditions;

/**
 * This event should be fired when entity is updated.
 */
public final class BeforeEntityDeleteEvent<T extends IWithName> extends ApplicationEvent {

    private final Class<T> clazz;
    private final T entity;

    public BeforeEntityDeleteEvent(final Object sourceToSet, final Class<T> clazzToSet, final T entityToSet) {
        super(sourceToSet);

        Preconditions.checkState(clazzToSet != null);
        clazz = clazzToSet;

        Preconditions.checkState(entityToSet != null);
        entity = entityToSet;
    }

    // API

    public final Class<T> getClazz() {
        return clazz;
    }

    public final T getEntity() {
        return entity;
    }

}
