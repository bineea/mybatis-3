package com.example.mybatis.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Title: Test<br>
 * Description:  <br>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author: <a href=mailto:guowenbin9@jd.com>郭文彬</a><br>
 * @date: 2021/4/26 23:00
 */
public class TestOp implements Serializable {
  private Long id;
  private Integer value;
  private Integer fakeValue;
  private String remark;
  private LocalDateTime createTime;

  @Override
  public String toString() {
    return "TestOp{" +
      "id=" + id +
      ", value=" + value +
      ", fakeValue=" + fakeValue +
      ", remark='" + remark + '\'' +
      ", createTime=" + createTime +
      '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Integer getFakeValue() {
    return fakeValue;
  }

  public void setFakeValue(Integer fakeValue) {
    this.fakeValue = fakeValue;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }
}
