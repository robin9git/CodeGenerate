// Copyright (C) 2012-2015 JIEZHI All rights reserved
package com.rgi.codeGenerate.yourCode;

import java.math.BigDecimal;

/** 
 * 类 名: XncSalePackageDesc <br/>
 * 描 述: 描述类完成的主要功能 <br/>
 * 作 者: who <br/>
 * 创 建： date <br/>
 *
 * 历 史: (版本)作者 时间 <br/>
 */
public class XncSalePackageDesc extends BaseEntity<XncSalePackageDesc> {

	private static final long serialVersionUID = 1L;
		private java.lang.Integer id;//   物理自增主键	private java.lang.String img_url;//   图片地址	private java.lang.String description;//   描述	private java.lang.Integer status;//   状态:default 1 active; 0 inactive	private java.sql.Timestamp add_time;//   添加时间	private java.lang.Integer package_id;//   礼包id	private java.lang.Integer disp_orders;//   排序	public java.lang.Integer getId() {	    return this.id;	}	public void setId(java.lang.Integer id) {	    this.id=id;	}	public java.lang.String getImg_url() {	    return this.img_url;	}	public void setImg_url(java.lang.String img_url) {	    this.img_url=img_url;	}	public java.lang.String getDescription() {	    return this.description;	}	public void setDescription(java.lang.String description) {	    this.description=description;	}	public java.lang.Integer getStatus() {	    return this.status;	}	public void setStatus(java.lang.Integer status) {	    this.status=status;	}	public java.sql.Timestamp getAdd_time() {	    return this.add_time;	}	public void setAdd_time(java.sql.Timestamp add_time) {	    this.add_time=add_time;	}	public java.lang.Integer getPackage_id() {	    return this.package_id;	}	public void setPackage_id(java.lang.Integer package_id) {	    this.package_id=package_id;	}	public java.lang.Integer getDisp_orders() {	    return this.disp_orders;	}	public void setDisp_orders(java.lang.Integer disp_orders) {	    this.disp_orders=disp_orders;	}
	
}