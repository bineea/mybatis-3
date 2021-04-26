package com.example.mybatis.mapper;

import com.example.mybatis.pojo.Test;

import java.util.List;

/**
 * Title: TestMapper<br>
 * Description:  <br>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author: <a href=mailto:guowenbin9@jd.com>郭文彬</a><br>
 * @date: 2021/4/26 23:05
 */
public interface TestMapper {

  /**
   *
   * @return
   */
  List<Test> findAll();

  /**
   *
   * @param id
   * @return
   */
  Test findById(Long id);

  /**
   *
   * @param test
   * @return
   */
  int updateById(Test test);

  /**
   *
   * @param id
   * @return
   */
  int deleteById(Long id);

  /**
   *
   * @param test
   * @return
   */
  int insert(Test test);
}
