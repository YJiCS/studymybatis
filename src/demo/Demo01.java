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
        //ʹ�ù������ģʽ
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //����SqlSession
        SqlSession session=factory.openSession();

        List<Users> list = session.selectList("selUsers.selAllUsers");
        for (Users flower : list) {
            System.out.println(flower.toString());
        }
        session.close();
    }
}
