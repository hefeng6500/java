package com.example.springbootmybatisplus.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.ibatis.javassist.runtime.Inner;

@Data
@TableName("user")
public class User {
  @TableId(type = IdType.ASSIGN_ID)
  private Long id;
  private String name;
  @TableField(value = "password", select = false)
  private String password;
  private Integer age;
  private String tel;
  @TableField(exist = false)
  private Integer online;

  @TableField(value = "is_deleted")
  @TableLogic(value = "0", delval = "1") // 逻辑删除，
  private Integer deleted;

  @Version
  private Integer version; // 用于乐观锁
}
