package top.liyf.service;

import top.liyf.bean.ShoppingCart;

public interface ShoppingCartService {

    public ShoppingCart getCartByUid(int uid);

    public ShoppingCart getCartBySid(int sid);
}
