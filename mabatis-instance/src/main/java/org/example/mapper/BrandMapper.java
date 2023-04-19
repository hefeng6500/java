package org.example.mapper;

import org.example.pojo.Brand;

import java.util.List;

public interface BrandMapper {
  /**
   * 查询所有
   */
  List<Brand> selectAll();
}
