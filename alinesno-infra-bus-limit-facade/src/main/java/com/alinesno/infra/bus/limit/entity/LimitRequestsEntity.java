package com.alinesno.infra.bus.limit.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 存储请求记录实体类
 * </p>
 * <p>
 * 该实体类用于存储请求记录的相关信息，包括请求路径、保存路径、请求应用、请求信息、文件名称、请求IP、响应时间、请求用户、文件类型和请求用户名等。
 * </p>
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("limit_requests")
public class LimitRequestsEntity extends InfraBaseEntity {

    /**
     * 请求路径
     */
    @TableField("request_url")
    private String requestUrl;

    /**
     * 保存路径
     */
    @TableField("storage_url")
    private String storageUrl;

    /**
     * 请求应用
     */
    @TableField("request_application")
    private String requestApplication;

    /**
     * 请求信息
     */
    @TableField("agent")
    private String agent;

    /**
     * 文件名称
     */
    @TableField("filename")
    private String filename;

    /**
     * 请求IP
     */
    @TableField("request_ip")
    private String requestIp;

    /**
     * 响应时间
     */
    @TableField("response_time")
    private long responseTime;

    /**
     * 请求用户
     */
    @TableField("request_user_id")
    private String requestUserId;

    /**
     * 文件类型
     */
    @TableField("request_type")
    private String requestType;

    /**
     * 请求用户名
     */
    @TableField("request_username")
    private String requestUsername;

    /**
     * 获取文件名称
     *
     * @return 文件名称
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名称
     *
     * @param filename 文件名称
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取请求路径
     *
     * @return 请求路径
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * 设置请求路径
     *
     * @param requestUrl 请求路径
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * 获取请求应用
     *
     * @return 请求应用
     */
    public String getRequestApplication() {
        return requestApplication;
    }

    /**
     * 设置请求应用
     *
     * @param requestApplication 请求应用
     */
    public void setRequestApplication(String requestApplication) {
        this.requestApplication = requestApplication;
    }

    /**
     * 获取请求IP
     *
     * @return 请求IP
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * 设置请求IP
     *
     * @param requestIp 请求IP
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    /**
     * 获取响应时间
     *
     * @return 响应时间
     */
    public long getResponseTime() {
        return responseTime;
    }

    /**
     * 设置响应时间
     *
     * @param responseTime 响应时间
     */
    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * 获取请求用户
     *
     * @return 请求用户
     */
    public String getRequestUserId() {
        return requestUserId;
    }

    /**
     * 设置请求用户
     *
     * @param requestUserId 请求用户
     */
    public void setRequestUserId(String requestUserId) {
        this.requestUserId = requestUserId;
    }

    /**
     * 获取文件类型
     *
     * @return 文件类型
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * 设置文件类型
     *
     * @param requestType 文件类型
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * 获取请求用户名
     *
     * @return 请求用户名
     */
    public String getRequestUsername() {
        return requestUsername;
    }

    /**
     * 设置请求用户名
     *
     * @param requestUsername 请求用户名
     */
    public void setRequestUsername(String requestUsername) {
        this.requestUsername = requestUsername;
    }

    /**
     * 获取请求信息
     *
     * @return 请求信息
     */
    public String getAgent() {
        return agent;
    }

    /**
     * 设置请求信息
     *
     * @param agent 请求信息
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /**
     * 获取保存路径
     *
     * @return 保存路径
     */
    public String getStorageUrl() {
        return storageUrl;
    }

    /**
     * 设置保存路径
     *
     * @param storageUrl 保存路径
     */
    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
    }

    @Override
    public String toString() {
        return "StorageRequestsEntity{" +
                "requestUrl='" + requestUrl + '\'' +
                ", storageUrl='" + storageUrl + '\'' +
                ", requestApplication='" + requestApplication + '\'' +
                ", agent='" + agent + '\'' +
                ", filename='" + filename + '\'' +
                ", requestIp='" + requestIp + '\'' +
                ", responseTime=" + responseTime +
                ", requestUserId='" + requestUserId + '\'' +
                ", requestType='" + requestType + '\'' +
                ", requestUsername='" + requestUsername + '\'' +
                '}';
    }
}