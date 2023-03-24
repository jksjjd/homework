package cn.itheima.Service;

import cn.itheima.DTO.SaveDTO;
import cn.itheima.pojo.Good;

public interface GoodService {
    Good getId(Long id);

    void save(SaveDTO saveDTO);
}
