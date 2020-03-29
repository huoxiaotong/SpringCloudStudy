package com.mumu.configclient;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 姜向前
 * @Date: 2018/5/29 13:21
 * @Description: 部门管理
 */
@Table(name = "hr_department_tbl")
public class Department implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name; //分公司、部门名称 not null

//  @Column(name = "type")
//  private Integer type; //部门类型；0：团队； 10：营业部；20：分公司； 30:总公司；40：集团

//  @Column(name = "code")
//  private String code; //部门代码

  @Column(name = "employeeNum")
  private Integer employeeNum; //部门员工标准个数

  @Column(name = "childDepartmentNum")
  private Integer childDepartmentNum; //子部门员工标准个数

  @Column(name = "parentId")
  private Integer parentId; // 上级部门id，为null时，表示为分公司级别
  @Column(name = "subId")
  private Integer subId; // 所在分公司的id

  @Column(name = "headerId")
  private Integer headerId; // 本部门的领导的staffpositionId

  @Column(name = "isReal")
  private Integer isReal; // 是否是真实部门，0：不是,是虚拟的部门，1：是

  @Column(name = "isCalcAchieve")
  private Integer isCalcAchieve; // 是否计算业绩： 0： 不； 1: 是

  @Column(name = "marketingRatioPlanId")
  private Integer marketingRatioPlanId; //本部门营销费用提成比例方案id

  @Column(name = "pubActivityRatioPlanId")
  private Integer pubActivityRatioPlanId; //公共活动费用提成比例方案id

  @Column(name = "updateTime")
  private Date updateTime; //最后一次更新时间

  @Column(name = "createTime")
  private Date createTime; //创建时间

  @Column(name = "status")
  private Integer status; //状态；0：有效；10：停用

  @Column(name = "levelCategoryId")
  private Integer levelCategoryId; //职级类别Id

  @Column(name = "startCode")
  private Integer startCode;
  @Column(name = "endCode")
  private Integer endCode;

 // 部门级别
  @Column(name = "level")
  private Integer level;

  // 一下作为表的临时字段
  @Transient
  private String statusStr;
  @Transient
  private String createTimeStr;
  @Transient
  private String updateTimeStr;
  @Transient
  private String levelName;
  @Transient
  private Integer departMentParentId;
  @Transient
  private String typeStr;
  @Transient
  private String staffName;
  @Transient
  private String parentName;
  @Transient
  private String marketingRatioPlanName;
  @Transient
  private String pubActivityRatioPlanName;
  @Transient
  private String isRealStr;
  @Transient
  private String subName;
  @Transient
  private Integer num; // 树形部门使用
    @Transient
    private List children;
  @Transient
  private String levelCategoryName;
    @Transient
    private Integer childCount;

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public Integer getLevelCategoryId() {
        return levelCategoryId;
    }

    public void setLevelCategoryId(Integer levelCategoryId) {
        this.levelCategoryId = levelCategoryId;
    }

    public String getLevelCategoryName() {
        return levelCategoryName;
    }

    public void setLevelCategoryName(String levelCategoryName) {
        this.levelCategoryName = levelCategoryName;
    }

    public String getIsRealStr() {
    return isRealStr;
  }

  public void setIsRealStr(String isRealStr) {
    this.isRealStr = isRealStr;
  }

  public String getSubName() {
    return subName;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public String getUpdateTimeStr() {
    return updateTimeStr;
  }

  public void setUpdateTimeStr(String updateTimeStr) {
    this.updateTimeStr = updateTimeStr;
  }

  public String getMarketingRatioPlanName() {
    return marketingRatioPlanName;
  }

  public void setMarketingRatioPlanName(String marketingRatioPlanName) {
    this.marketingRatioPlanName = marketingRatioPlanName;
  }

  public String getPubActivityRatioPlanName() {
    return pubActivityRatioPlanName;
  }

  public void setPubActivityRatioPlanName(String pubActivityRatioPlanName) {
    this.pubActivityRatioPlanName = pubActivityRatioPlanName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  public Integer getType() {
//    return type;
//  }
//
//  public void setType(Integer type) {
//    this.type = type;
//  }
//


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Integer getHeaderId() {
    return headerId;
  }

  public void setHeaderId(Integer headerId) {
    this.headerId = headerId;
  }

  public Integer getIsReal() {
    return isReal;
  }

  public void setIsReal(Integer isReal) {
    this.isReal = isReal;
  }

  public Integer getIsCalcAchieve() {
    return isCalcAchieve;
  }

  public void setIsCalcAchieve(Integer isCalcAchieve) {
    this.isCalcAchieve = isCalcAchieve;
  }

  public Integer getMarketingRatioPlanId() {
    return marketingRatioPlanId;
  }

  public void setMarketingRatioPlanId(Integer marketingRatioPlanId) {
    this.marketingRatioPlanId = marketingRatioPlanId;
  }

  public Integer getPubActivityRatioPlanId() {
    return pubActivityRatioPlanId;
  }

  public void setPubActivityRatioPlanId(Integer pubActivityRatioPlanId) {
    this.pubActivityRatioPlanId = pubActivityRatioPlanId;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getStatusStr() {
    return statusStr;
  }

  public void setStatusStr(String statusStr) {
    this.statusStr = statusStr;
  }

  public String getCreateTimeStr() {
    return createTimeStr;
  }

  public void setCreateTimeStr(String createTimeStr) {
    this.createTimeStr = createTimeStr;
  }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getDepartMentParentId() {
    return departMentParentId;
  }

  public void setDepartMentParentId(Integer departMentParentId) {
    this.departMentParentId = departMentParentId;
  }

  public String getTypeStr() {
    return typeStr;
  }

  public void setTypeStr(String typeStr) {
    this.typeStr = typeStr;
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public Integer getSubId() {
    return subId;
  }

  public void setSubId(Integer subId) {
    this.subId = subId;
  }


  public Integer getEmployeeNum() {
    return employeeNum;
  }

  public void setEmployeeNum(Integer employeeNum) {
    this.employeeNum = employeeNum;
  }

  public Integer getChildDepartmentNum() {
    return childDepartmentNum;
  }

  public void setChildDepartmentNum(Integer childDepartmentNum) {
    this.childDepartmentNum = childDepartmentNum;
  }

    public Integer getStartCode() {
        return startCode;
    }

    public void setStartCode(Integer startCode) {
        this.startCode = startCode;
    }

    public Integer getEndCode() {
        return endCode;
    }

    public void setEndCode(Integer endCode) {
        this.endCode = endCode;
    }



  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeNum=" + employeeNum +
                ", childDepartmentNum=" + childDepartmentNum +
                ", parentId=" + parentId +
                ", subId=" + subId +
                ", headerId=" + headerId +
                ", isReal=" + isReal +
                ", isCalcAchieve=" + isCalcAchieve +
                ", marketingRatioPlanId=" + marketingRatioPlanId +
                ", pubActivityRatioPlanId=" + pubActivityRatioPlanId +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", status=" + status +
                ", levelCategoryId=" + levelCategoryId +
                ", startCode=" + startCode +
                ", endCode=" + endCode +
                ", statusStr='" + statusStr + '\'' +
                ", createTimeStr='" + createTimeStr + '\'' +
                ", updateTimeStr='" + updateTimeStr + '\'' +
                ", departMentParentId=" + departMentParentId +
                ", typeStr='" + typeStr + '\'' +
                ", staffName='" + staffName + '\'' +
                ", parentName='" + parentName + '\'' +
                ", marketingRatioPlanName='" + marketingRatioPlanName + '\'' +
                ", pubActivityRatioPlanName='" + pubActivityRatioPlanName + '\'' +
                ", isRealStr='" + isRealStr + '\'' +
                ", subName='" + subName + '\'' +
                ", num=" + num +
                ", children=" + children +
                ", levelCategoryName='" + levelCategoryName + '\'' +
                '}';
    }
}
