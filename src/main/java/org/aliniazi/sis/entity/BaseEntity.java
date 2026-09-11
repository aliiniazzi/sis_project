package org.aliniazi.sis.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aliniazi.sis.enums.DataState;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;


@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, comment = "Record identifier")
    private Long id;

    @Version
    @Column(name = "version", nullable = false, comment = "Record version for optimistic locking")
    private Long version;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false, comment = "Record creation timestamp")
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false, comment = "Record last update timestamp")
    private Instant updatedAt;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "data_state", nullable = false, comment = "Record logical state")
    private DataState dataState;

}
