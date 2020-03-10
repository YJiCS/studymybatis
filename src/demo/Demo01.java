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
        //ʹ�ù������ģʽ
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //����SqlSession
        SqlSession session=factory.openSession();


//        List<Users> list = session.selectList("selUsers.selAllUsers");
//        for (Users flower : list) {
//            System.out.println(flower.toString());
//        }
        //ָ��������ѯ
//        Users u=session.selectOne("selUsers.selOne",123);
//        System.out.println(u);
        //ʵ�ַ�ҳ
//        int pageSize=2;
//        int pageNumber=1;
//        Map<String,Object> map=new HashMap<>();
//        map.put("pageSize",pageSize);
//        map.put("pageStart",pageSize*(pageNumber-1));
//        List<Users> list =session.selectList("selUsers.selPage",map);
//        System.out.println(list);

/*
        //ʵ������  mybatis�����񲻻��Զ��ύ����Ҫִ��seeeion.commit()�ύ��
        Users users=new Users();
        users.setUserNo(7);
        users.setUserName("7");
        users.setUserPwd("7");
        users.setUserSex(1);
        users.setUserAddress("����");
        try {
            int i=session.insert("selUsers.ins",users);
            if (i>0){
                System.out.println("��һ�γɹ�");
            }else {
                System.out.println("��һ��ʧ��");
            }
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();//�����쳣��������ع�
        }
        Users users2=new Users();
        users2.setUserNo(6);
        users2.setUserName("7");
        users2.setUserPwd("7");
        users2.setUserSex(1);
        users2.setUserAddress("����");
        try {
            int i=session.insert("selUsers.ins",users2);
            if (i>0){
                System.out.println("�ڶ��γɹ�");
            }else {
                System.out.println("�ڶ���ʧ��");
            }
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();//�����쳣��������ع�
        }
        session.commit();
*/

        //ʹ�ýӿڰ�
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<Users> list = userMapper.selAll();
        for (Users users :
                list) {
            System.out.println(users);
        }
        session.close();

        System.out.println("����0304");
        System.out.println("����0305");
        System.out.println("����0309");
        System.out.println("����0310");
    }
}
