package com.projectnike.nike.mapper;

import com.projectnike.nike.domain.ImportVO;

import java.util.List;

public interface MainMapper {
    public String getYear();
    public List<ImportVO> getSalesSum(String year);
}
