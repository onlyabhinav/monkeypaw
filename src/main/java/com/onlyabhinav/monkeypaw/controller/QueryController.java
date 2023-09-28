package com.onlyabhinav.monkeypaw.controller;


import com.onlyabhinav.monkeypaw.dao.DBHelperDao;
import com.onlyabhinav.monkeypaw.dto.ColumnDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query")
public class QueryController {


    @Autowired
    private DBHelperDao dbHelperDao;

    @RequestMapping("/page")
    public String getQueryPage(){
        return "query";
    }


    //get endpoint to get table definition
    @RequestMapping("/tdef")

    public List<ColumnDto> getTableDefinition(){

        return dbHelperDao.getTableColumns("CUSTOMERS2");


    }

}
