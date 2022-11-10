package cn.bdqn.model.Param;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class productParam {

    private int id;
    private String productName;
    private String productDate;
    private int productSum;
    private String productDesc;
    private BigDecimal productPrice;
}
