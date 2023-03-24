package cn.itheima.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Good {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Double price;
    private Integer number;
    private Integer status;
}
