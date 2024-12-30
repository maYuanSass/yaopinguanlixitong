package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YaopinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 药品订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yaopin_order")
public class YaopinOrderView extends YaopinOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单类型的值
	*/
	@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
	private String yaopinOrderValue;
	/**
	* 审核状态的值
	*/
	@ColumnInfo(comment="审核状态的字典表值",type="varchar(200)")
	private String yaopinOrderYesnoValue;
	/**
	* 支付类型的值
	*/
	@ColumnInfo(comment="支付类型的字典表值",type="varchar(200)")
	private String yaopinOrderPaymentValue;

	//级联表 收货地址
					 
		/**
		* 收货地址 的 创建用户
		*/
		@ColumnInfo(comment="创建用户",type="int(20)")
		private Integer addressYonghuId;
		/**
		* 收货人
		*/

		@ColumnInfo(comment="收货人",type="varchar(200)")
		private String addressName;
		/**
		* 电话
		*/

		@ColumnInfo(comment="电话",type="varchar(200)")
		private String addressPhone;
		/**
		* 地址
		*/

		@ColumnInfo(comment="地址",type="varchar(200)")
		private String addressDizhi;
		/**
		* 是否默认地址
		*/
		@ColumnInfo(comment="是否默认地址",type="int(11)")
		private Integer isdefaultTypes;
			/**
			* 是否默认地址的值
			*/
			@ColumnInfo(comment="是否默认地址的字典表值",type="varchar(200)")
			private String isdefaultValue;
	//级联表 药品
		/**
		* 药品名称
		*/

		@ColumnInfo(comment="药品名称",type="varchar(200)")
		private String yaopinName;
		/**
		* 药品编号
		*/

		@ColumnInfo(comment="药品编号",type="varchar(200)")
		private String yaopinUuidNumber;
		/**
		* 药品照片
		*/

		@ColumnInfo(comment="药品照片",type="varchar(200)")
		private String yaopinPhoto;
		/**
		* 处方药
		*/
		@ColumnInfo(comment="处方药",type="int(11)")
		private Integer chufangyaoTypes;
			/**
			* 处方药的值
			*/
			@ColumnInfo(comment="处方药的字典表值",type="varchar(200)")
			private String chufangyaoValue;
		/**
		* 药品类型
		*/
		@ColumnInfo(comment="药品类型",type="int(11)")
		private Integer yaopinTypes;
			/**
			* 药品类型的值
			*/
			@ColumnInfo(comment="药品类型的字典表值",type="varchar(200)")
			private String yaopinValue;
		/**
		* 二级类型
		*/
		@ColumnInfo(comment="二级类型",type="int(11)")
		private Integer yaopinErjiTypes;
			/**
			* 二级类型的值
			*/
			@ColumnInfo(comment="二级类型的字典表值",type="varchar(200)")
			private String yaopinErjiValue;
		/**
		* 药品库存
		*/

		@ColumnInfo(comment="药品库存",type="int(11)")
		private Integer yaopinKucunNumber;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 药品原价
		*/
		@ColumnInfo(comment="药品原价",type="decimal(10,2)")
		private Double yaopinOldMoney;
		/**
		* 现价
		*/
		@ColumnInfo(comment="现价",type="decimal(10,2)")
		private Double yaopinNewMoney;
		/**
		* 药品热度
		*/

		@ColumnInfo(comment="药品热度",type="int(11)")
		private Integer yaopinClicknum;
		/**
		* 药品功效
		*/

		@ColumnInfo(comment="药品功效",type="longtext")
		private String yaopinGongxiaoContent;
		/**
		* 药品禁忌
		*/

		@ColumnInfo(comment="药品禁忌",type="longtext")
		private String yaopinJinjiContent;
		/**
		* 药品说明
		*/

		@ColumnInfo(comment="药品说明",type="longtext")
		private String yaopinContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yaopinDelete;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public YaopinOrderView() {

	}

	public YaopinOrderView(YaopinOrderEntity yaopinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, yaopinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 订单类型的值
	*/
	public String getYaopinOrderValue() {
		return yaopinOrderValue;
	}
	/**
	* 设置： 订单类型的值
	*/
	public void setYaopinOrderValue(String yaopinOrderValue) {
		this.yaopinOrderValue = yaopinOrderValue;
	}
	//当前表的
	/**
	* 获取： 审核状态的值
	*/
	public String getYaopinOrderYesnoValue() {
		return yaopinOrderYesnoValue;
	}
	/**
	* 设置： 审核状态的值
	*/
	public void setYaopinOrderYesnoValue(String yaopinOrderYesnoValue) {
		this.yaopinOrderYesnoValue = yaopinOrderYesnoValue;
	}
	//当前表的
	/**
	* 获取： 支付类型的值
	*/
	public String getYaopinOrderPaymentValue() {
		return yaopinOrderPaymentValue;
	}
	/**
	* 设置： 支付类型的值
	*/
	public void setYaopinOrderPaymentValue(String yaopinOrderPaymentValue) {
		this.yaopinOrderPaymentValue = yaopinOrderPaymentValue;
	}


	//级联表的get和set 收货地址
		/**
		* 获取：收货地址 的 创建用户
		*/
		public Integer getAddressYonghuId() {
			return addressYonghuId;
		}
		/**
		* 设置：收货地址 的 创建用户
		*/
		public void setAddressYonghuId(Integer addressYonghuId) {
			this.addressYonghuId = addressYonghuId;
		}

		/**
		* 获取： 收货人
		*/
		public String getAddressName() {
			return addressName;
		}
		/**
		* 设置： 收货人
		*/
		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}

		/**
		* 获取： 电话
		*/
		public String getAddressPhone() {
			return addressPhone;
		}
		/**
		* 设置： 电话
		*/
		public void setAddressPhone(String addressPhone) {
			this.addressPhone = addressPhone;
		}

		/**
		* 获取： 地址
		*/
		public String getAddressDizhi() {
			return addressDizhi;
		}
		/**
		* 设置： 地址
		*/
		public void setAddressDizhi(String addressDizhi) {
			this.addressDizhi = addressDizhi;
		}
		/**
		* 获取： 是否默认地址
		*/
		public Integer getIsdefaultTypes() {
			return isdefaultTypes;
		}
		/**
		* 设置： 是否默认地址
		*/
		public void setIsdefaultTypes(Integer isdefaultTypes) {
			this.isdefaultTypes = isdefaultTypes;
		}


			/**
			* 获取： 是否默认地址的值
			*/
			public String getIsdefaultValue() {
				return isdefaultValue;
			}
			/**
			* 设置： 是否默认地址的值
			*/
			public void setIsdefaultValue(String isdefaultValue) {
				this.isdefaultValue = isdefaultValue;
			}
	//级联表的get和set 药品

		/**
		* 获取： 药品名称
		*/
		public String getYaopinName() {
			return yaopinName;
		}
		/**
		* 设置： 药品名称
		*/
		public void setYaopinName(String yaopinName) {
			this.yaopinName = yaopinName;
		}

		/**
		* 获取： 药品编号
		*/
		public String getYaopinUuidNumber() {
			return yaopinUuidNumber;
		}
		/**
		* 设置： 药品编号
		*/
		public void setYaopinUuidNumber(String yaopinUuidNumber) {
			this.yaopinUuidNumber = yaopinUuidNumber;
		}

		/**
		* 获取： 药品照片
		*/
		public String getYaopinPhoto() {
			return yaopinPhoto;
		}
		/**
		* 设置： 药品照片
		*/
		public void setYaopinPhoto(String yaopinPhoto) {
			this.yaopinPhoto = yaopinPhoto;
		}
		/**
		* 获取： 处方药
		*/
		public Integer getChufangyaoTypes() {
			return chufangyaoTypes;
		}
		/**
		* 设置： 处方药
		*/
		public void setChufangyaoTypes(Integer chufangyaoTypes) {
			this.chufangyaoTypes = chufangyaoTypes;
		}


			/**
			* 获取： 处方药的值
			*/
			public String getChufangyaoValue() {
				return chufangyaoValue;
			}
			/**
			* 设置： 处方药的值
			*/
			public void setChufangyaoValue(String chufangyaoValue) {
				this.chufangyaoValue = chufangyaoValue;
			}
		/**
		* 获取： 药品类型
		*/
		public Integer getYaopinTypes() {
			return yaopinTypes;
		}
		/**
		* 设置： 药品类型
		*/
		public void setYaopinTypes(Integer yaopinTypes) {
			this.yaopinTypes = yaopinTypes;
		}


			/**
			* 获取： 药品类型的值
			*/
			public String getYaopinValue() {
				return yaopinValue;
			}
			/**
			* 设置： 药品类型的值
			*/
			public void setYaopinValue(String yaopinValue) {
				this.yaopinValue = yaopinValue;
			}
		/**
		* 获取： 二级类型
		*/
		public Integer getYaopinErjiTypes() {
			return yaopinErjiTypes;
		}
		/**
		* 设置： 二级类型
		*/
		public void setYaopinErjiTypes(Integer yaopinErjiTypes) {
			this.yaopinErjiTypes = yaopinErjiTypes;
		}


			/**
			* 获取： 二级类型的值
			*/
			public String getYaopinErjiValue() {
				return yaopinErjiValue;
			}
			/**
			* 设置： 二级类型的值
			*/
			public void setYaopinErjiValue(String yaopinErjiValue) {
				this.yaopinErjiValue = yaopinErjiValue;
			}

		/**
		* 获取： 药品库存
		*/
		public Integer getYaopinKucunNumber() {
			return yaopinKucunNumber;
		}
		/**
		* 设置： 药品库存
		*/
		public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
			this.yaopinKucunNumber = yaopinKucunNumber;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 药品原价
		*/
		public Double getYaopinOldMoney() {
			return yaopinOldMoney;
		}
		/**
		* 设置： 药品原价
		*/
		public void setYaopinOldMoney(Double yaopinOldMoney) {
			this.yaopinOldMoney = yaopinOldMoney;
		}

		/**
		* 获取： 现价
		*/
		public Double getYaopinNewMoney() {
			return yaopinNewMoney;
		}
		/**
		* 设置： 现价
		*/
		public void setYaopinNewMoney(Double yaopinNewMoney) {
			this.yaopinNewMoney = yaopinNewMoney;
		}

		/**
		* 获取： 药品热度
		*/
		public Integer getYaopinClicknum() {
			return yaopinClicknum;
		}
		/**
		* 设置： 药品热度
		*/
		public void setYaopinClicknum(Integer yaopinClicknum) {
			this.yaopinClicknum = yaopinClicknum;
		}

		/**
		* 获取： 药品功效
		*/
		public String getYaopinGongxiaoContent() {
			return yaopinGongxiaoContent;
		}
		/**
		* 设置： 药品功效
		*/
		public void setYaopinGongxiaoContent(String yaopinGongxiaoContent) {
			this.yaopinGongxiaoContent = yaopinGongxiaoContent;
		}

		/**
		* 获取： 药品禁忌
		*/
		public String getYaopinJinjiContent() {
			return yaopinJinjiContent;
		}
		/**
		* 设置： 药品禁忌
		*/
		public void setYaopinJinjiContent(String yaopinJinjiContent) {
			this.yaopinJinjiContent = yaopinJinjiContent;
		}

		/**
		* 获取： 药品说明
		*/
		public String getYaopinContent() {
			return yaopinContent;
		}
		/**
		* 设置： 药品说明
		*/
		public void setYaopinContent(String yaopinContent) {
			this.yaopinContent = yaopinContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYaopinDelete() {
			return yaopinDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYaopinDelete(Integer yaopinDelete) {
			this.yaopinDelete = yaopinDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "YaopinOrderView{" +
			", yaopinOrderValue=" + yaopinOrderValue +
			", yaopinOrderYesnoValue=" + yaopinOrderYesnoValue +
			", yaopinOrderPaymentValue=" + yaopinOrderPaymentValue +
			", addressName=" + addressName +
			", addressPhone=" + addressPhone +
			", addressDizhi=" + addressDizhi +
			", yaopinName=" + yaopinName +
			", yaopinUuidNumber=" + yaopinUuidNumber +
			", yaopinPhoto=" + yaopinPhoto +
			", yaopinKucunNumber=" + yaopinKucunNumber +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", yaopinOldMoney=" + yaopinOldMoney +
			", yaopinNewMoney=" + yaopinNewMoney +
			", yaopinClicknum=" + yaopinClicknum +
			", yaopinGongxiaoContent=" + yaopinGongxiaoContent +
			", yaopinJinjiContent=" + yaopinJinjiContent +
			", yaopinContent=" + yaopinContent +
			", yaopinDelete=" + yaopinDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
