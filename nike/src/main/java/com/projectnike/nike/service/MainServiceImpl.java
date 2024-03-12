package com.projectnike.nike.service;

import com.projectnike.nike.domain.ImportVO;
import com.projectnike.nike.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService{
    @Autowired
    private MainMapper mainMapper;

    @Override
    public String mainyear(){

        return mainMapper.getYear();
    }

    @Override
    public List<ImportVO> monthSum(String year){
        return mainMapper.getSalesSum(year);
    }
}
