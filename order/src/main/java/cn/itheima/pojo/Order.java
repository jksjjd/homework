package cn.itheima.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "redro")
public class Order {
    private Long id;
    private Long goodId;
    private String orderTime;
    //支付状态
    private String status;
    @TableField(exist = false)
    private Good good;
}
