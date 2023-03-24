package cn.itheima.DTO;

import lombok.Data;

@Data
public class SaveDTO {
    private Long id;
    private String name;
    private Double price;
    private Integer number;
    private Integer status;
}
