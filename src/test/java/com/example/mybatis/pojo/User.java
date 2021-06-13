package com.example.mybatis.pojo;

import java.io.Serializable;

public class User implements Serializable {
  /**
   * 唯一标识
   */
  private String id;
  /**
   * 昵称
   */
  private String name;
  /**
   * 性别
   */
  private String male;
  /**
   * 邮箱（唯一）
   */
  private String email;
  /**
   * 账号（字母+数字，并且唯一）
   */
  private String loginName;
  /**
   * 密码
   */
  private String passwd;
  /**
   * 状态
   */
  private String status;

  /**
   * 关联角色
   */
  private Role role;

  @Override
  public String toString() {
    return "User{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", male='" + male + '\'' +
      ", email='" + email + '\'' +
      ", loginName='" + loginName + '\'' +
      ", passwd='" + passwd + '\'' +
      ", status='" + status + '\'' +
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

  public String getMale() {
    return male;
  }

  public void setMale(String male) {
    this.male = male;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
