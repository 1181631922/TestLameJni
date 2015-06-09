package cn.edu.sjzc.fanyafeng.testlamejni.test;

import cn.edu.sjzc.fanyafeng.testlamejni.util.S;

/**
 * Created by Administrator on 2015/6/9/0009.
 */
public class GenericsTest {


    public static void main(String[] args) {
        S.pl("测试泛型");
        S.l();
        init();

    }

    private static void init() {
        initInteger();
        initString();
        initOneStringParams();
        initOneIntParams();
        initTwoStringParams();
        initTwoParams();
        initObject();
    }

    private static void initInteger() {
        Generics<Integer> integerGenerics = new Generics<Integer>(518);
        integerGenerics.showType();
        int i = integerGenerics.getT();
        S.pl("value=", i);
        S.l();
    }

    private static void initString() {
        Generics<String> stringGenerics = new Generics<String>("fanyafeng");
        stringGenerics.showType();
        String s = stringGenerics.getT();
        S.pl("value=", s);
        S.l();
    }

    private static void initOneStringParams() {
        OneStringParams oneStringParams = new OneStringParams();
        oneStringParams.show("fanyafeng");
        S.l();
    }

    private static void initOneIntParams() {
        OneIntParams oneIntParams = new OneIntParams();
        oneIntParams.show(24);
        S.l();
    }

    private static void initTwoStringParams() {
        TwoStringParams twoStringParams = new TwoStringParams();
        twoStringParams.show("姓名", "樊亚风");
        S.l();
    }

    private static void initTwoParams() {
        TwoParams twoParams = new TwoParams();
        twoParams.show("年龄", 24);
        S.l();
    }

    private static void initObject() {
        FanyafengBean fanyafengBean = new FanyafengBean("樊亚风");
        fanyafengBean.show("姓名");
        FanyafengBean fanyafengBean1 = new FanyafengBean(24);
        fanyafengBean1.show("年龄");
    }

}
