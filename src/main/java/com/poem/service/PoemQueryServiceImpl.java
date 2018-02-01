package com.poem.service;

import com.poem.dao.ADInfoRepository;
import com.poem.dto.ADInfoDTO;
import com.poem.entity.ADInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ztang
 * @date 11:20 2018/2/1
 */
@Service
public class PoemQueryServiceImpl implements PoemQueryService {
    @Autowired
    private ADInfoRepository adInfoRepository;

    @Override
    public List<ADInfo> findBy(String adType) {
        return adInfoRepository.findByAdType(adType);
    }

    @Override
    public void addAD(ADInfoDTO adInfoDTO) {
        ADInfo adInfo = new ADInfo(adInfoDTO);
        adInfoRepository.save(adInfo);
    }
}
