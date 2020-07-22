package jdbc.dao;

import jdbc.vo.PartVO;

import java.util.List;

public interface PartDAO {
    void insert(PartVO part);
    void update(PartVO part);
    void delete(PartVO part);
    PartVO selectById(int id);
    List<PartVO> selectAll();
}
