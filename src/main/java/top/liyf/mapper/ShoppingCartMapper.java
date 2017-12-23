package top.liyf.mapper;

import top.liyf.bean.ShoppingCart;

public interface ShoppingCartMapper {

    public ShoppingCart getCartByUid(int uid);

    public ShoppingCart getCartBySid(int sid);
}
