package com.alinesno.infra.bus.limit.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 存储应用实体类
 * </p>
 * <p>
 * 该类继承自InfraBaseEntity，表示存储应用的基本信息。
 * </p>
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("limit_application")
public class LimitApplicationEntity extends InfraBaseEntity {

    /**
     * 应用名称
     */
    @TableField("app_name")
    private String appName;

    /**
     * 应用代码
     */
    @TableField("application_code")
    private String applicationCode;

    /**
     * 应用值
     */
    private String token;

    /**
     * 最大文件长度
     */
    @TableField("max_file_size")
    private Integer maxFileSize;

    /**
     * 文件类型
     */
    @TableField("file_type")
    private String fileType;

    /**
     * 接口密钥
     */
    @TableField("api_key")
    private String apiKey;

    /**
     * 最大上传次数
     */
    @TableField("max_upload_count")
    private Integer maxUploadCount;

    /**
     * 最大下载次数
     */
    @TableField("max_download_count")
    private Integer maxDownloadCount;

    /**
     * 应用logo标识
     */
    private String banner;

    /**
     * 公司名称
     */
    @TableField("company_name")
    private String companyName;

    /**
     * 所开通渠道
     */
    @TableField("channel_ids")
    private String channelIds;

    /**
     * 应用码
     */
    @TableField("app_code")
    private String appCode;

    // 省略了getter和setter方法


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Integer getMaxUploadCount() {
        return maxUploadCount;
    }

    public void setMaxUploadCount(Integer maxUploadCount) {
        this.maxUploadCount = maxUploadCount;
    }

    public Integer getMaxDownloadCount() {
        return maxDownloadCount;
    }

    public void setMaxDownloadCount(Integer maxDownloadCount) {
        this.maxDownloadCount = maxDownloadCount;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(String channelIds) {
        this.channelIds = channelIds;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}