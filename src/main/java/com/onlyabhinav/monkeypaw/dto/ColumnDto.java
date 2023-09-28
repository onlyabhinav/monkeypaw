package com.onlyabhinav.monkeypaw.dto;

import com.onlyabhinav.monkeypaw.entities.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Column}
 */
@Getter
@Setter
public class ColumnDto implements Serializable {
    Integer ordinalPosition;
    String columnName;
    Boolean isNullable;
    String dataType;
    Integer characterMaximumLength;
}