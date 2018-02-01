package com.poem.entity;

import com.poem.dto.ADInfoDTO;
import com.poem.util.BeanUtil;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 广告信息
 *
 * @author ztang
 * @date 11:07 2018/2/1
 */
@Document(collection = "poem_ad")
@TypeAlias("poem_ad")
public class ADInfo {

    @Id
    private String id;
    @Field("ad_id")
    private String adId;
    @Field("ad_address")
    private String adAddress;
    @Field("ad_link")
    private String adLink;
    @Field("add_type")
    private String adType;

    public ADInfo(){}

    public ADInfo(ADInfoDTO adInfoDTO) {
        BeanUtil.copyPropertiesIgnoreNull(adInfoDTO, this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAdAddress() {
        return adAddress;
    }

    public void setAdAddress(String adAddress) {
        this.adAddress = adAddress;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }
}
