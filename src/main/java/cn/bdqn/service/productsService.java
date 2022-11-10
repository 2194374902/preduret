package cn.bdqn.service;

import cn.bdqn.model.Dto.productsDto;
import cn.bdqn.model.Dto.qualitiesDto;
import cn.bdqn.model.Param.productParam;

import java.util.List;

public interface productsService {

    List<productsDto> queryall(String mohu);
    void del(int id);

    void add(productParam productParam);

    productsDto queryid(int id);
    void update(qualitiesDto qualitiesDto);
}
