package com.poem.dao;

import com.poem.entity.ADInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author ztang
 * @date 11:13 2018/2/1
 */
public interface ADInfoRepository extends MongoRepository<ADInfo, String> {
    List<ADInfo> findByAdType(String adType);
}
