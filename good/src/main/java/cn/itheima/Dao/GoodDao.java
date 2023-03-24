package cn.itheima.Dao;

import cn.itheima.pojo.Good;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodDao extends BaseMapper<Good> {
    Good getId(Long id);
}
