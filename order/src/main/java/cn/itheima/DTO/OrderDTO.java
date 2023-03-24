package cn.itheima.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long goodId;
    private String goodName;
    private Double goodPrice;
    private Integer number;
    private Long id;
    private LocalDateTime orderTime;
}
