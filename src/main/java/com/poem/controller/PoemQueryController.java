package com.poem.controller;

import com.poem.dto.ADInfoDTO;
import com.poem.dto.Result;
import com.poem.dto.ResultUtil;
import com.poem.service.PoemQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ztang
 * @date 11:02 2018/2/1
 */
@RestController
public class PoemQueryController {
    @Autowired
    private PoemQueryService poemQueryService;

    @GetMapping("ad/getlist/{orderby}")
    public Result queryAD(@PathVariable String orderby) {
        return ResultUtil.success(poemQueryService.findBy(orderby));
    }

    @PostMapping("ad/add")
    public Result addAD(@RequestBody ADInfoDTO adInfoDTO) {
        poemQueryService.addAD(adInfoDTO);
        return ResultUtil.success();
    }

    public static void main(String[] args) {
        System.out.println("helloworld");
    }
}
