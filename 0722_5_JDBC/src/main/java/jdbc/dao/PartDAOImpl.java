package jdbc.dao;

import jdbc.vo.PartVO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("partDao")
public class PartDAOImpl implements PartDAO {

    private JdbcTemplate template;

    public PartDAOImpl(DataSource dataSource){
        template = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(PartVO part) {
//        String sql = "INSERT INTO parts VALUE (DEFAULT, '"+ part.getPartName()+"')";
        String sql = "INSERT INTO parts VALUE (DEFAULT, ?)";

        if (template.update(sql, part.getPartName())>0){
            System.out.println("등록성공");
        }else{
            System.out.println("등록실패");
        }
//        template.update(sql);
    }

    @Override
    public void update(PartVO part) {

    }

    @Override
    public void delete(PartVO part) {

    }

    @Override
    public PartVO selectById(int id) {
        return null;
    }

    @Override
    public List<PartVO> selectAll() {
        String sql = "SELECT * from parts Order by partId";
        List<PartVO> parts = template.query(sql, new RowMapper<PartVO>(){
            @Override
            public PartVO mapRow(ResultSet resultSet, int i) throws SQLException {
                int partId = resultSet.getInt("partId");
                String partName = resultSet.getString("partName");
                PartVO partVO = new PartVO(partId, partName);
                return partVO;
            }
        });
        return parts;
    }
}
