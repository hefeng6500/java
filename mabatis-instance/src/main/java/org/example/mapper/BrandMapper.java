package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
  /**
   * 查询所有
   */
  List<Brand> selectAll();

  @Select("select * from tb_user where id = #{id}")
  Brand selectById(int id);

  // List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName,@Param("brandName") String brandName);

  // List<Brand> selectByCondition(Brand brand);

  List<Brand> selectByCondition(Map map);

  /**
   * 单条件动态查询
   * @param brand
   * @return
   */
  List<Brand> selectByConditionSingle(Brand brand);

  /**
   * 添加
   */
  void add(Brand brand);

  /**
   * 修改
   */
  int update(Brand brand);
  /**
   * 根据id删除
   */
  void deleteById(int id);
  /**
   * 批量删除
   */
  int deleteByIds(int[] ids);





}
