package com.rgi.codeGenerate;

import com.rgi.codeGenerate.factory.CodeGenerateFactory;

/**
 * 类 名: CodeUtil <br/>
 * 描 述: 代码生成工具类 <br/>
 * 作 者: jiezhi <br/>
 * 创 建： 2015-8-21 <br/>
 *
 * 历 史: (版本)作者 时间 <br/>
 */
public class CodeUtil {
	
	/* 配置连接数据库属性 */
//	public static String url = "jdbc:mysql://192.168.1.26:3306/cloud-mirror?useUnicode=true&amp;characterEncoding=UTF-8";
//	public static String url = "jdbc:mysql://101.200.175.225:3306/xinnc?useUnicode=true&amp;characterEncoding=UTF-8";
//	public static String url = "jdbc:mysql://192.168.1.26:3306/cloudmirror?useUnicode=true&amp;characterEncoding=UTF-8";
	public static String url = "jdbc:mysql://192.168.1.26:3306/xnc_production?useUnicode=true&amp;characterEncoding=UTF-8";
	public static String databaseName = "xnc_production";
	public static String username = "root";
	public static String password = "abc@123";
	public static String tableName = "xnc_sale_package_desc";
	
	/**
	 * 描 述：工具入口 <br/>
	 * 作 者：jiezhi<br/>
	 * 历 史: (版本)作者 时间 注释 <br/>
	 * @param args
	 */
	public static void main(String[] args) {
	
		CodeGenerateFactory.codeGenerate();
	}
}