package demo;

import com.mapper.UserMapper;
import com.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        //使用工厂设计模式
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //生产SqlSession
        SqlSession session=factory.openSession();


//        List<Users> list = session.selectList("selUsers.selAllUsers");
//        for (Users flower : list) {
//            System.out.println(flower.toString());
//        }
        //指定参数查询
//        Users u=session.selectOne("selUsers.selOne",123);
//        System.out.println(u);
        //实现分页
//        int pageSize=2;
//        int pageNumber=1;
//        Map<String,Object> map=new HashMap<>();
//        map.put("pageSize",pageSize);
//        map.put("pageStart",pageSize*(pageNumber-1));
//        List<Users> list =session.selectList("selUsers.selPage",map);
//        System.out.println(list);

/*
        //实现新增  mybatis中事务不会自动提交，需要执行seeeion.commit()提交。
        Users users=new Users();
        users.setUserNo(7);
        users.setUserName("7");
        users.setUserPwd("7");
        users.setUserSex(1);
        users.setUserAddress("北京");
        try {
            int i=session.insert("selUsers.ins",users);
            if (i>0){
                System.out.println("第一次成功");
            }else {
                System.out.println("第一次失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();//出现异常进行事务回滚
        }
        Users users2=new Users();
        users2.setUserNo(6);
        users2.setUserName("7");
        users2.setUserPwd("7");
        users2.setUserSex(1);
        users2.setUserAddress("北京");
        try {
            int i=session.insert("selUsers.ins",users2);
            if (i>0){
                System.out.println("第二次成功");
            }else {
                System.out.println("第二次失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();//出现异常进行事务回滚
        }
        session.commit();
*/

        //使用接口绑定
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<Users> list = userMapper.selAll();
        for (Users users :
                list) {
            System.out.println(users);
        }
        session.close();

        System.out.println("更新0304");
    }
}
