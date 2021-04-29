package com.example.mybatis.mapper;

import com.example.mybatis.pojo.TestOp;

import java.util.List;

/**
 * Title: TestMapper<br>
 * Description:  <br>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author: <a href=mailto:guowenbin9@jd.com>郭文彬</a><br>
 * @date: 2021/4/26 23:05
 */
public interface TestOpMapper {

  /**
   *
   * @return
   */
  List<TestOp> findAll();

  /**
   *
   * @param id
   * @return
   */
  TestOp findById(Long id);

  /**
   *
   * @param testOp
   * @return
   */
  int updateById(TestOp testOp);

  /**
   *
   * @param id
   * @return
   */
  int deleteById(Long id);

  /**
   *
   * @param testOp
   * @return
   */
  int insert(TestOp testOp);
}
