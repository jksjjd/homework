package cn.itheima.Service;

import cn.itheima.DTO.SaveDTO;
import cn.itheima.Dao.GoodDao;
import cn.itheima.pojo.Good;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService{
    @Autowired
    private GoodDao goodDao;
    @Override
    public Good getId(Long id) {
        Good good=goodDao.selectById(id);
        return good;
    }

    @Override
    public void save(SaveDTO saveDTO) {
        Good good=new Good();
        BeanUtils.copyProperties(saveDTO, good);
        goodDao.insert(good);
    }
}
