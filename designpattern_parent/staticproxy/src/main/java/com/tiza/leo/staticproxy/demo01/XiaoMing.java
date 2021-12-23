package com.tiza.leo.staticproxy.demo01;

/**
 * @author leowei
 * @date 2021/12/23  - 23:36
 */
public class XiaoMing implements FindHouse {
    @Override
    public void find() {
        System.out.println(" XiaoMing.find()--------- XiaoMing可以开始入住了！！！！");
    }
}
