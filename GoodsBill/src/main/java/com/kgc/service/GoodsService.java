package com.kgc.service;

import com.kgc.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selectAll(Integer goodsDistrict);
    Goods getid(int id);
    int upd(Goods goods);
}
