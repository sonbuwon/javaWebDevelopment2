package com.zerock.jdbcex.service;

import com.zerock.jdbcex.dao.TodoDAO;
import com.zerock.jdbcex.domain.TodoVO;
import com.zerock.jdbcex.dto.TodoDTO;
import com.zerock.jdbcex.util.MapperUtil;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

@Log4j2
public enum TodoService {
    INSTANCE;

    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService() {
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public void register(TodoDTO todoDTO) throws Exception {
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        //System.out.println("todoVO: " + todoVO);
        log.info(todoVO);
        dao.insert(todoVO);
    }
}
