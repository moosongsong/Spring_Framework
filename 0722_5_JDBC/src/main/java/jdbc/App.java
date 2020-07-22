package jdbc;

import jdbc.dao.PartDAO;
import jdbc.vo.PartVO;
import org.springframework.cglib.core.ProcessArrayCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        PartDAO dao = context.getBean(PartDAO.class);
        System.out.println(dao);

        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);

        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplete");
        System.out.println(template);

//        PartVO part = new PartVO();
//        part.setPartName("에라이");
//        dao.insert(part);

        List<PartVO> list = dao.selectAll();
        for (PartVO partVO: list){
            System.out.println(partVO);
        }
    }
}
