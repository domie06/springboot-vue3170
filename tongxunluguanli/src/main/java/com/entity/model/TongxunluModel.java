package com.entity.model;

import com.entity.TongxunluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 通讯录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TongxunluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 朋友姓名
     */
    private String tongxunluName;


    /**
     * 朋友手机号
     */
    private String tongxunluPhone;


    /**
     * 朋友照片
     */
    private String tongxunluPhoto;


    /**
     * 朋友电子邮箱
     */
    private String tongxunluEmail;


    /**
     * 朋友标签
     */
    private String tongxunluBiaoqian;


    /**
     * 所在公司
     */
    private String tongxunluGongsi;


    /**
     * 所在部门
     */
    private String tongxunluBumen;


    /**
     * 职位
     */
    private String tongxunluZhiwei;


    /**
     * 现住址
     */
    private String tongxunluXianzhuzhi;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 朋友详细介绍
     */
    private String tongxunluContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：朋友姓名
	 */
    public String getTongxunluName() {
        return tongxunluName;
    }


    /**
	 * 设置：朋友姓名
	 */
    public void setTongxunluName(String tongxunluName) {
        this.tongxunluName = tongxunluName;
    }
    /**
	 * 获取：朋友手机号
	 */
    public String getTongxunluPhone() {
        return tongxunluPhone;
    }


    /**
	 * 设置：朋友手机号
	 */
    public void setTongxunluPhone(String tongxunluPhone) {
        this.tongxunluPhone = tongxunluPhone;
    }
    /**
	 * 获取：朋友照片
	 */
    public String getTongxunluPhoto() {
        return tongxunluPhoto;
    }


    /**
	 * 设置：朋友照片
	 */
    public void setTongxunluPhoto(String tongxunluPhoto) {
        this.tongxunluPhoto = tongxunluPhoto;
    }
    /**
	 * 获取：朋友电子邮箱
	 */
    public String getTongxunluEmail() {
        return tongxunluEmail;
    }


    /**
	 * 设置：朋友电子邮箱
	 */
    public void setTongxunluEmail(String tongxunluEmail) {
        this.tongxunluEmail = tongxunluEmail;
    }
    /**
	 * 获取：朋友标签
	 */
    public String getTongxunluBiaoqian() {
        return tongxunluBiaoqian;
    }


    /**
	 * 设置：朋友标签
	 */
    public void setTongxunluBiaoqian(String tongxunluBiaoqian) {
        this.tongxunluBiaoqian = tongxunluBiaoqian;
    }
    /**
	 * 获取：所在公司
	 */
    public String getTongxunluGongsi() {
        return tongxunluGongsi;
    }


    /**
	 * 设置：所在公司
	 */
    public void setTongxunluGongsi(String tongxunluGongsi) {
        this.tongxunluGongsi = tongxunluGongsi;
    }
    /**
	 * 获取：所在部门
	 */
    public String getTongxunluBumen() {
        return tongxunluBumen;
    }


    /**
	 * 设置：所在部门
	 */
    public void setTongxunluBumen(String tongxunluBumen) {
        this.tongxunluBumen = tongxunluBumen;
    }
    /**
	 * 获取：职位
	 */
    public String getTongxunluZhiwei() {
        return tongxunluZhiwei;
    }


    /**
	 * 设置：职位
	 */
    public void setTongxunluZhiwei(String tongxunluZhiwei) {
        this.tongxunluZhiwei = tongxunluZhiwei;
    }
    /**
	 * 获取：现住址
	 */
    public String getTongxunluXianzhuzhi() {
        return tongxunluXianzhuzhi;
    }


    /**
	 * 设置：现住址
	 */
    public void setTongxunluXianzhuzhi(String tongxunluXianzhuzhi) {
        this.tongxunluXianzhuzhi = tongxunluXianzhuzhi;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：朋友详细介绍
	 */
    public String getTongxunluContent() {
        return tongxunluContent;
    }


    /**
	 * 设置：朋友详细介绍
	 */
    public void setTongxunluContent(String tongxunluContent) {
        this.tongxunluContent = tongxunluContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
