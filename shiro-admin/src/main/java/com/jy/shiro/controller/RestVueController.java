package com.jy.shiro.controller;

import com.github.pagehelper.PageInfo;
import com.jy.shiro.business.entity.Resources;
import com.jy.shiro.business.service.SysResourcesService;
import com.jy.shiro.business.vo.ResourceConditionVO;
import com.jy.shiro.framework.object.PageResult;
import com.jy.shiro.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RestVueController
 * @Description TODO
 * @Author jinyong
 * @DATE 2019/5/16 11:03
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping("/vue")
public class RestVueController {
    @Autowired
    private SysResourcesService resourcesService;
    @PostMapping("/list")
    public PageResult list(ResourceConditionVO vo) {
        PageInfo<Resources> pageInfo = resourcesService.findPageBreakByCondition(vo);
        return ResultUtil.tablePage(pageInfo);
    }
}
