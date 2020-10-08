package com.kgc.service.impl;

import com.kgc.mapper.GoodsMapper;
import com.kgc.pojo.Goods;
import com.kgc.pojo.GoodsExample;
import com.kgc.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;


    @Override
    public List<Goods> selectAll(Integer goodsDistrict) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if(goodsDistrict!=null){
            criteria.andGoodsdistrictEqualTo(goodsDistrict);
        }else{
            return goodsMapper.selectByExample(null);
        }
        return goodsMapper.selectByExample(goodsExample);
    }

    @Override
    public Goods getid(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int upd(Goods goods) {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }
}
