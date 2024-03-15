package com.projectnike.nike.service;

import com.projectnike.nike.domain.ImportVO;

import java.util.List;

public interface MainService {
    public String mainyear();

    public List<ImportVO> monthSum(String year);
}
