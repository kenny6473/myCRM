import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.domain.StudentVo;
import com.bjpowernode.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {


    @Test
    public void test01(){

    }
    @Test
    public void selectStudents(){
        String config = "conf/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        StudentDao stu = (StudentDao) ac.getBean("studentDao");

        List<Map<String,Object>> maps = stu.select20();
        for (Map<String,Object> map:maps){
            Set<String> set = map.keySet();
            for (String key:set){
                System.out.println("key:" +key);
                System.out.println("value:" +map.get(key));
            }
            System.out.println("========================");
        }
    }

    @Test
    public void selectStudents02(){
        String config = "conf/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        StudentDao stu = (StudentDao) ac.getBean("studentDao");

       List<StudentVo> vos = stu.select21();

       for(StudentVo vo:vos){
           System.out.println(vo);
       }
    }

    @Test
    public void selectStudents03(){
        String config = "conf/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        /*StudentDao stu = (StudentDao) ac.getBean("studentDao");*/

        //从spring容器获取service对象，而不是直接调用dao层，实现解耦合
        StudentServiceImpl service =(StudentServiceImpl)ac.getBean("studentServiceImpl");

        List<StudentVo> vos = service.find22("l");

        for(StudentVo vo:vos){
            System.out.println(vo);
        }
    }
}
