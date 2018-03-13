package com.yonyou.cloud.ops.alert.ops.alert.domain.dto;

import java.util.Date;

import com.xiaoleilu.hutool.date.DateUtil;
public class AlertInfoBO {
    
	/**
	 * alertinfoId
	 */
    private Integer id;
    /**
     * 报警详细信息
     */
    private String alertDetail; 
    
    /**
     * 规则组Id
     */
    private Integer groupId; 
    /**
     * 规则组状态
     */
    private String status; 
    /**
     * 规则组名称
     */
    private String groupName; 
    
    /**
     * 創建時間
     */
    private Date CreateDate;
    
    
    /**
     * 操作時間
     */
    
    private Date updateDate;
    
	/**
     * 操作者
     */
     
    private String updateUser;
    
    public String getUpdateDate() {
		return DateUtil.formatDateTime(updateDate);
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAlertDetail() {
		return alertDetail;
	}
	public void setAlertDetail(String alertDetail) {
		this.alertDetail = alertDetail;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getCreateDate() {
		return DateUtil.formatDateTime(CreateDate);
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
}
