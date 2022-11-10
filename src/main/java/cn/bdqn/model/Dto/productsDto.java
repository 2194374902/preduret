package cn.bdqn.model.Dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class productsDto {
    private int id;

    private String productName;
    private String productDate;
    private int productSum;
    private String productDesc;
    private BigDecimal productPrice;
    private int score;


}
