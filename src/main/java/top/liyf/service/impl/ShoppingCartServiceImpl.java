package top.liyf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.liyf.bean.ShoppingCart;
import top.liyf.mapper.ShoppingCartMapper;
import top.liyf.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Autowired
    ShoppingCartMapper mapper;

    @Override
    public ShoppingCart getCartByUid(int uid) {
        return mapper.getCartByUid(uid);
    }

    @Override
    public ShoppingCart getCartBySid(int sid) {
        return mapper.getCartBySid(sid);
    }
}
