package com.ml.proxy.staticproxy;

/**
 * @ClassName Mother
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/18 22:14
 * @Version 1.0
 */
public class Mother implements Person {

    private Son son;

    public Mother(Son son) {
        this.son = son;
    }

    @Override
    public void findGirlfriend() {
        System.out.println("我要给儿子找女朋友啦！");
        son.findGirlfriend();
        System.out.println("发现一个小改改,儿子，可以去相亲了！");
    }
}
