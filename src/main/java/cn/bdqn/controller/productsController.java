package cn.bdqn.controller;

import cn.bdqn.model.Dto.productsDto;
import cn.bdqn.model.Dto.qualitiesDto;
import cn.bdqn.model.Param.productParam;
import cn.bdqn.service.productsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class productsController {
    @Autowired
    productsService productsService;

    @GetMapping("/")
    public String index(@RequestParam(value = "mohu", required = false, defaultValue = "") String mohu,
                        Model model,
                        @RequestParam(value = "pageNun", required = false, defaultValue = "1") Integer pageNum) {
        List<productsDto> queryall = productsService.queryall(mohu);

        PageHelper.startPage(pageNum, 3);
        PageInfo<productsDto> pageInfo = new PageInfo<>(queryall);


        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("mohu", mohu);

        return "index";
    }

    @GetMapping("/del/{id}")
    public String del(@PathVariable("id") int id) {
        productsService.del(id);
        return "redirect:/";
    }

    @GetMapping("/insert")
    public String insert() {
        return "insert";
    }

    @PostMapping("/add")
    public String add(productParam productParam) {
        productsService.add(productParam);
        return "redirect:/";
    }

    @GetMapping("/zhi/{id}")
    public String zhi(@PathVariable("id") int id, Model model) {
        model.addAttribute("list", productsService.queryid(id));
        productsService.queryid(id);
        return "zhi";
    }

    @GetMapping("/update")
    public String update(qualitiesDto qualitiesDto){

        productsService.update(qualitiesDto);
        System.out.println(qualitiesDto.getScore());
        return "redirect:/";
    }

}
