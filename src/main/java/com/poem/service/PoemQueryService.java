package com.poem.service;

import com.poem.dto.ADInfoDTO;
import com.poem.entity.ADInfo;

import java.util.List;

/**
 * @author ztang
 * @date 11:19 2018/2/1
 */
public interface PoemQueryService {
    List<ADInfo> findBy(String adType);
    void addAD(ADInfoDTO adInfoDTO);
}
