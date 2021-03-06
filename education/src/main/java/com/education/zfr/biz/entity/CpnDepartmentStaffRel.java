package com.education.zfr.biz.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cpn_department_staff_rel")
public class CpnDepartmentStaffRel{

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="REL_ID")
    private Long relId;

    /**
     * 菜单ID
     */
    @Column(name="DEPARTMENT_ID")
    private Long departmentId;

    /**
     * 角色ID
     */
    @Column(name="STAFF_ID")
    private Long staffId;

    /**
     * 创建时间
     */
    @Column(name="CREATE_TIME")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name="CREATE_BY")
    private String createBy;

    /**
     * 更新时间
     */
    @Column(name="UPDATE_TIME")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name="UPDATE_BY")
    private String updateBy;

    public void setRelId(Long relId){
        this.relId=relId;
    }
    public Long getRelId(){
        return relId;
    }
    public void setDepartmentId(Long departmentId){
        this.departmentId=departmentId;
    }
    public Long getDepartmentId(){
        return departmentId;
    }
    public void setStaffId(Long staffId){
        this.staffId=staffId;
    }
    public Long getStaffId(){
        return staffId;
    }
    public void setCreateTime(Date createTime){
        this.createTime=createTime;
    }
    public Date getCreateTime(){
        return createTime;
    }
    public void setCreateBy(String createBy){
        this.createBy=createBy;
    }
    public String getCreateBy(){
        return createBy;
    }
    public void setUpdateTime(Date updateTime){
        this.updateTime=updateTime;
    }
    public Date getUpdateTime(){
        return updateTime;
    }
    public void setUpdateBy(String updateBy){
        this.updateBy=updateBy;
    }
    public String getUpdateBy(){
        return updateBy;
    }
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}