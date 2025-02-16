/**
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
import com.example.mybatis.mapper.RoleMapper;
import com.example.mybatis.mapper.TestOpMapper;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.pojo.Role;
import com.example.mybatis.pojo.TestOp;
import com.example.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.submitted.permissions.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Title: MybatisTest<br>
 * Description:  <br>
 * @date: 2021/4/22 22:32
 */
public class MybatisTest {

  private static SqlSession sqlSession;

  @Before
  public void openSession() throws IOException {
    // 记得将配置文件sqlMapperConfig.xml所在的目录resources设置为“Test Resources”类型，否则idea编译时无法识别该目录
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    sqlSession = sqlSessionFactory.openSession();
  }

  @Test
  public void handleTestOp_findById() {
    TestOpMapper testOpMapper = sqlSession.getMapper(TestOpMapper.class);
    TestOp testOp = testOpMapper.findById(1L);
    System.out.println(testOp.toString());
  }

  @Test
  public void handleUser_findById() {
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = mapper.findById("default");
    System.out.println("user.getId:"+user.getId());
    System.out.println("user.getRole:"+user.getRole());
  }

  @Test
  public void handleRole_findById() {
    RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
    Role role = mapper.findById("admin");
    System.out.println("role.getId:"+role.getId());
    System.out.println("role.getUser:"+role.getUserList());
  }

  @Test
  public void handleRole_findRoleAndUserListById() {
    RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
    Role role = mapper.findRoleAndUserListById("admin");
    System.out.println("role.getId:"+role.getId());
    System.out.println("role.getUser:"+role.getUserList());
  }

}
