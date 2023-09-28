package com.onlyabhinav.monkeypaw.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DbColumn {

// database column attribute
private String columnName;
private String columnType;
private String columnSize;
private String columnNullable;
private String columnDefault;
private String columnIsAutoIncrement;
private String columnIsPrimaryKey;
private String columnIsForeignKey;
private String columnIsUniqueKey;
private String columnIsIndexed;
private String columnIsNotNull;

}
