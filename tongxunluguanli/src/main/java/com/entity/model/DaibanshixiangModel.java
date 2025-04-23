package com.entity.model;

import com.entity.DaibanshixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 待办事项
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DaibanshixiangModel implements Serializable {
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
     * 待办事项标题
     */
    private String daibanshixiangName;


    /**
     * 待办事项类型
     */
    private Integer daibanshixiangTypes;


    /**
     * 待办事项内容
     */
    private String daibanshixiangContent;


    /**
     * 办理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date banliTime;


    /**
     * 是否办理
     */
    private Integer banliTypes;


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
	 * 获取：待办事项标题
	 */
    public String getDaibanshixiangName() {
        return daibanshixiangName;
    }


    /**
	 * 设置：待办事项标题
	 */
    public void setDaibanshixiangName(String daibanshixiangName) {
        this.daibanshixiangName = daibanshixiangName;
    }
    /**
	 * 获取：待办事项类型
	 */
    public Integer getDaibanshixiangTypes() {
        return daibanshixiangTypes;
    }


    /**
	 * 设置：待办事项类型
	 */
    public void setDaibanshixiangTypes(Integer daibanshixiangTypes) {
        this.daibanshixiangTypes = daibanshixiangTypes;
    }
    /**
	 * 获取：待办事项内容
	 */
    public String getDaibanshixiangContent() {
        return daibanshixiangContent;
    }


    /**
	 * 设置：待办事项内容
	 */
    public void setDaibanshixiangContent(String daibanshixiangContent) {
        this.daibanshixiangContent = daibanshixiangContent;
    }
    /**
	 * 获取：办理时间
	 */
    public Date getBanliTime() {
        return banliTime;
    }


    /**
	 * 设置：办理时间
	 */
    public void setBanliTime(Date banliTime) {
        this.banliTime = banliTime;
    }
    /**
	 * 获取：是否办理
	 */
    public Integer getBanliTypes() {
        return banliTypes;
    }


    /**
	 * 设置：是否办理
	 */
    public void setBanliTypes(Integer banliTypes) {
        this.banliTypes = banliTypes;
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
