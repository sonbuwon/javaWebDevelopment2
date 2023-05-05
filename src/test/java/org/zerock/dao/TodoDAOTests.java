package org.zerock.dao;

import com.zerock.jdbcex.dao.ConnectionUtil;
import com.zerock.jdbcex.dao.TodoDAO;
import lombok.Cleanup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDAOTests {
    private TodoDAO todoDAO;

    @BeforeEach
    public void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
        System.out.println(todoDAO.getTime2());
    }
}
