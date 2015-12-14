package com.rgi.codeGenerate.def;

public class CodeResourceUtil {

	public static String DIVER_NAME = "com.mysql.jdbc.Driver";
//	public static String URL = "jdbc:mysql://localhost:3306/grandLine?useUnicode=true&characterEncoding=UTF-8";
//	public static String USERNAME = "root";
//	public static String PASSWORD = "zhijie.";
//	public static String DATABASE_NAME = "grandLine"; // 数据库名
	public static String DATABASE_TYPE = "mysql";
	public static String DATABASE_TYPE_MYSQL = "mysql";
	public static String DATABASE_TYPE_ORACLE = "oracle";
	public static String JEECG_UI_FIELD_REQUIRED_NUM = "4";
	public static String JEECG_UI_FIELD_SEARCH_NUM = "3";
	public static String web_root_package = "src/main/webapp";
	public static String source_root_package = "src/main/java";
	public static String bussiPackage = "com.rgi.codeGenerate.yourCode";	//实体类的package
	public static String bussiPackageUrl = "com/rgi/codeGenerate/yourCode";	//生成代码文件存放目录
	public static String entity_package = "";
	public static String page_package = "";
	public static String ENTITY_URL;
	public static String PAGE_URL;
	public static String ENTITY_URL_INX;
	public static String PAGE_URL_INX;
	public static String TEMPLATEPATH;
	public static String CODEPATH;
	public static String JSPPATH;
	public static String JEECG_GENERATE_TABLE_ID;
	public static String JEECG_GENERATE_UI_FILTER_FIELDS;
	public static String SYSTEM_ENCODING;

	static {
		DIVER_NAME = getDIVER_NAME();
//		URL = getURL();
//		USERNAME = getUSERNAME();
//		PASSWORD = getPASSWORD();
//		DATABASE_NAME = getDATABASE_NAME();

		SYSTEM_ENCODING = getSYSTEM_ENCODING();
		TEMPLATEPATH = getTEMPLATEPATH();
		source_root_package = getSourceRootPackage();
		web_root_package = getWebRootPackage();
		bussiPackage = getBussiPackage();
		bussiPackageUrl = bussiPackage.replace(".", "/");

		JEECG_GENERATE_TABLE_ID = getJeecg_generate_table_id();

		JEECG_UI_FIELD_SEARCH_NUM = getJeecg_ui_search_filed_num();

//		if ((URL.indexOf("mysql") >= 0) || (URL.indexOf("MYSQL") >= 0))
//			DATABASE_TYPE = DATABASE_TYPE_MYSQL;
//		else if ((URL.indexOf("oracle") >= 0) || (URL.indexOf("ORACLE") >= 0)) {
//			DATABASE_TYPE = DATABASE_TYPE_ORACLE;
//		}

		source_root_package = source_root_package.replace(".", "/");
		web_root_package = web_root_package.replace(".", "/");

		ENTITY_URL = source_root_package + "/" + bussiPackageUrl + "/" + entity_package + "/";

		PAGE_URL = source_root_package + "/" + bussiPackageUrl + "/" + page_package + "/";

		ENTITY_URL_INX = bussiPackage + "." + entity_package + ".";

		PAGE_URL_INX = bussiPackage + "." + page_package + ".";

		CODEPATH = source_root_package + "/" + bussiPackageUrl + "/";

		JSPPATH = web_root_package + "/" + bussiPackageUrl + "/";
	}

	
	public static final String getDIVER_NAME() {
		return DIVER_NAME;
	}

//	public static final String getURL() {
//		return URL;
//	}
//
//	public static final String getUSERNAME() {
//		return USERNAME;
//	}
//
//	public static final String getPASSWORD() {
//		return PASSWORD;
//	}
//
//	public static final String getDATABASE_NAME() {
//		return DATABASE_NAME;
//	}

	private static String getBussiPackage() {
		return bussiPackage;
	}

	public static final String getEntityPackage() {
		return entity_package;
	}

	public static final String getPagePackage() {
		return page_package;
	}

	public static final String getTEMPLATEPATH() {
		return TEMPLATEPATH;
	}

	public static final String getSourceRootPackage() {
		return source_root_package;
	}

	public static final String getWebRootPackage() {
		return web_root_package;
	}

	public static final String getSYSTEM_ENCODING() {
		return SYSTEM_ENCODING;
	}

	public static final String getJeecg_generate_table_id() {
		return JEECG_GENERATE_TABLE_ID;
	}

	public static final String getJeecg_generate_ui_filter_fields() {
		return JEECG_GENERATE_UI_FILTER_FIELDS;
	}

	public static final String getJeecg_ui_search_filed_num() {
		return JEECG_UI_FIELD_SEARCH_NUM;
	}

	public static final String getJeecg_ui_field_required_num() {
		return JEECG_UI_FIELD_SEARCH_NUM;
	}
	
}