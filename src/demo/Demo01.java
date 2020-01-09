package demo;

import com.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        //使用工厂设计模式
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //生产SqlSession
        SqlSession session=factory.openSession();

        List<Users> list = session.selectList("selUsers.selAllUsers");
        for (Users flower : list) {
            System.out.println(flower.toString());
        }
        session.close();
    }
}
