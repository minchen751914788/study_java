package com.minchen.august23;

public class LazySingleton {
    //https://blog.csdn.net/GJ_007/article/details/123874405
    private static volatile LazySingleton instance = null; //保证instance在所有线程中同步
    private LazySingleton(){}; //避免类在外部被实例化
    public static synchronized LazySingleton getInstance(){
        //instance加方法前同步
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
