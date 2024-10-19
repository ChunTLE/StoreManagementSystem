package cn.pcs.shopadminn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class JDBC {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @GetMapping("/list")
    public List<Map<String, Object>> list() {
        String sql="select * from book";
        List<Map<String, Object>> list_map = jdbcTemplate.queryForList(sql);
        return list_map;
    }
}
