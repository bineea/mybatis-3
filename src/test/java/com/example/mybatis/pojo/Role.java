package com.example.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
  /**
   * 唯一标识
   */
  private String id;
  /**
   * 名称
   */
  private String name;
  /**
   * 序号
   */
  private Integer list;
  /**
   * 描述
   */
  private String info;
  /**
   * 是否系统自带
   */
  private boolean system;

  /**
   * 关联用户
   */
  private List<User> userList;

  @Override
  public String toString() {
    return "Role{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", list=" + list +
      ", info='" + info + '\'' +
      ", system=" + system +
      '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getList() {
    return list;
  }

  public void setList(Integer list) {
    this.list = list;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public boolean isSystem() {
    return system;
  }

  public void setSystem(boolean system) {
    this.system = system;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void setUserList(List<User> userList) {
    this.userList = userList;
  }
}
