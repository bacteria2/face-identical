package com.pingan.fi.algorithm.engine;

/**
 * @author IonCannon
 * @date 2018/6/13
 * @decription : content
 */
public class AlgorithmCastException extends Exception {

    public AlgorithmCastException(String message) {
        super("算法运行结果错误,详情:"+message);
    }
}
