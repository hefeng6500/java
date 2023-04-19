package org.example.pojo;

public class Brand {

  // id 主键
  private Integer id;
  // 品牌名称
  private String brandName;
  // 企业名称
  private String companyName;
  // 排序字段
  private Integer ordered;
  // 描述信息
  private String description;
  // 状态：0：禁用  1：启用
  private Integer status;

  public Integer getId() {
    return id;
  }

  public String getBrandName() {
    return brandName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public Integer getOrdered() {
    return ordered;
  }

  public String getDescription() {
    return description;
  }

  public Integer getStatus() {
    return status;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setOrdered(Integer ordered) {
    this.ordered = ordered;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}
