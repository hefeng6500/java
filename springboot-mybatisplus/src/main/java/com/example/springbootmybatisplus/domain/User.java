package com.example.springbootmybatisplus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.javassist.runtime.Inner;

@Data
// @TableName("user")
public class User {
  // @TableId(type = IdType.ASSIGN_ID)
  private Long id;
  private String name;
  @TableField(value = "password", select = false)
  private String password;
  private Integer age;
  private String tel;
  @TableField(exist = false)
  private Integer online;
}
