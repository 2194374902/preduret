package cn.bdqn.service.impl;

import cn.bdqn.mapper.productsMapper;
import cn.bdqn.model.Dto.productsDto;
import cn.bdqn.model.Dto.qualitiesDto;
import cn.bdqn.model.Param.productParam;
import cn.bdqn.service.productsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class productsServiceImpl implements productsService {
    @Autowired
    productsMapper productsMapper;
    @Override
    public List<productsDto> queryall(String mohu) {
        return productsMapper.queryall(mohu);
    }

    @Override
    public void del(int id) {
        productsMapper.del(id);
    }

    @Override
    public void add(productParam productParam) {
        productsMapper.add(productParam);
        System.out.println("1111111");
        productsMapper.addzhi(productParam.getId());
    }

    @Override
    public productsDto queryid(int id) {
        return productsMapper.queryid(id);
    }

    @Override
    public void update(qualitiesDto qualitiesDto) {
        productsMapper.update(qualitiesDto);
    }
}
