package cn.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Good {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private Integer number;
    private Integer status;
}
