import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.submitted.permissions.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * Title: MybatisTest<br>
 * Description:  <br>
 * @date: 2021/4/22 22:32
 */
public class MybatisTest {

  public SqlSession openSession() throws IOException {
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    return sqlSession;
  }

  public static void main(String[] args) throws IOException {
    MybatisTest mybatisTest = new MybatisTest();
    System.out.println(mybatisTest.openSession());
  }
}
