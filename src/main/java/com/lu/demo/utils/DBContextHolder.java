package com.lu.demo.utils;

public class DBContextHolder {
	private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static String getDBType() {
        String db = contextHolder.get();
        if(db == null) {
            db = DBType.DB_TYPE_MASTER; //Ä¬ÈÏÊÇmaster¿â
        }

        return db;
    }

    public static void setDBType(String dbType) {
        contextHolder.set(dbType);
    }

    public static void clearDBType() {
        contextHolder.remove();
    }
}
