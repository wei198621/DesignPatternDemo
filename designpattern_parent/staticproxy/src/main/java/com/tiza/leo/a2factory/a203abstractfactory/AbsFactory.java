package com.tiza.leo.a2factory.a203abstractfactory;

import com.tiza.leo.a2factory.Pizza;

/**
 * @author leowei
 * @date 2021/12/26  - 23:21
 */
public interface AbsFactory {
    Pizza CreatePizza(String orderType);
}
