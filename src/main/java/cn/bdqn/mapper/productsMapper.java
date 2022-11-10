package cn.bdqn.mapper;

import cn.bdqn.model.Dto.productsDto;
import cn.bdqn.model.Dto.qualitiesDto;
import cn.bdqn.model.Param.productParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
@Component
public interface productsMapper {
    List<productsDto> queryall(String mohu);

    void del(int id);


    void add(productParam productParam);

    void addzhi(int id);

    productsDto queryid(int id);

    void update(qualitiesDto qualitiesDto);
}
