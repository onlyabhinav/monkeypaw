package com.onlyabhinav.monkeypaw.dao;

import com.onlyabhinav.monkeypaw.dto.ColumnDto;
import com.onlyabhinav.monkeypaw.dto.DbColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBHelperDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ColumnDto> getTableColumns(String tableName){
        String sql = """
                SELECT COLUMN_NAME, DATA_TYPE, IS_NULLABLE, CHARACTER_MAXIMUM_LENGTH, ORDINAL_POSITION
                  FROM information_schema.columns
                 WHERE 
                   table_name   = 'CUSTOMERS2'
                     and table_schema = 'MGM'
                     order by ORDINAL_POSITION 
                """;

        List<ColumnDto>    columnDtos = jdbcTemplate.query(sql, new BeanPropertyRowMapper(ColumnDto.class));

        return columnDtos;
    }


}
