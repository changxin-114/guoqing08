package com.kgc.controller;

import com.kgc.pojo.Goods;
import com.kgc.service.GoodsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsController {
    @Resource
    GoodsService goodsService;

    @RequestMapping("/tiao")
    public String tiao(){
        return "cha";
    }
    @RequestMapping("/selectAll")
    public String selectAll(Model model,Integer goodsDistrict){
        List<Goods> goods = goodsService.selectAll(goodsDistrict);
        model.addAttribute("goods",goods);
        return "A";
    }

    @RequestMapping("/getid")
    public String getid(Model model,int id){
        Goods goods = goodsService.getid(id);
        model.addAttribute("goods",goods);
        return "upd";
    }

    @RequestMapping("/upd")
    public String upd(Goods goods,int id,String goodsname,float goodsprice,int goodscount,int billstatus){
        goods.setId(id);
        goods.setGoodsname(goodsname);
        goods.setGoodsprice(goodsprice);
        goods.setGoodscount(goodscount);
        goods.setBillstatus(billstatus);
        goodsService.upd(goods);
        return "redirect:selectAll";
    }
}
