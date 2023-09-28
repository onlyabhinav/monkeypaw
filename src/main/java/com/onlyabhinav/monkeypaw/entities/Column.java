package com.onlyabhinav.monkeypaw.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "columns", schema = "information_schema")
public class Column {
    @Id
    @jakarta.persistence.Column(name = "ordinal_position", columnDefinition = "cardinal_number(0, 0)")
    private Integer ordinalPosition;

    @jakarta.persistence.Column(name = "column_name", columnDefinition = "sql_identifier(0, 0)")
    private String columnName;

    @jakarta.persistence.Column(name = "is_nullable", columnDefinition = "yes_or_no(0, 0)")
    private Boolean isNullable;

    @jakarta.persistence.Column(name = "data_type", columnDefinition = "character_data(0, 0)")
    private String dataType;

    @jakarta.persistence.Column(name = "character_maximum_length", columnDefinition = "cardinal_number(0, 0)")
    private Integer characterMaximumLength;

}