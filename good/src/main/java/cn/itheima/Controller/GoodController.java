package cn.itheima.Controller;

import cn.itheima.DTO.SaveDTO;
import cn.itheima.Service.GoodService;
import cn.itheima.pojo.Good;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private GoodService goodService;

    @GetMapping("/{id}")
    public Good getId(@PathVariable Long id){
        Good good=goodService.getId(id);
        return good;
    }
    @PostMapping("/sava")
    public void insert(SaveDTO saveDTO){
        goodService.save(saveDTO);
    }
}
