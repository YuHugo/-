package com.lero.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 读取properties配置
 * @author 科帮网
 *
 */
public class PropertiesUtil {
	
	public static String getValue(String key) {
		Properties  prop = new Properties();
		InputStream in = new PropertiesUtil().getClass().getResourceAsStream("/dorm.properties");
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (String)prop.get(key);
	}
}
