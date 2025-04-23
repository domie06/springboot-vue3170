package com.entity.vo;

import com.entity.DaibanshixiangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 待办事项
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("daibanshixiang")
public class DaibanshixiangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 待办事项标题
     */

    @TableField(value = "daibanshixiang_name")
    private String daibanshixiangName;


    /**
     * 待办事项类型
     */

    @TableField(value = "daibanshixiang_types")
    private Integer daibanshixiangTypes;


    /**
     * 待办事项内容
     */

    @TableField(value = "daibanshixiang_content")
    private String daibanshixiangContent;


    /**
     * 办理时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "banli_time")
    private Date banliTime;


    /**
     * 是否办理
     */

    @TableField(value = "banli_types")
    private Integer banliTypes;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：待办事项标题
	 */
    public String getDaibanshixiangName() {
        return daibanshixiangName;
    }


    /**
	 * 获取：待办事项标题
	 */

    public void setDaibanshixiangName(String daibanshixiangName) {
        this.daibanshixiangName = daibanshixiangName;
    }
    /**
	 * 设置：待办事项类型
	 */
    public Integer getDaibanshixiangTypes() {
        return daibanshixiangTypes;
    }


    /**
	 * 获取：待办事项类型
	 */

    public void setDaibanshixiangTypes(Integer daibanshixiangTypes) {
        this.daibanshixiangTypes = daibanshixiangTypes;
    }
    /**
	 * 设置：待办事项内容
	 */
    public String getDaibanshixiangContent() {
        return daibanshixiangContent;
    }


    /**
	 * 获取：待办事项内容
	 */

    public void setDaibanshixiangContent(String daibanshixiangContent) {
        this.daibanshixiangContent = daibanshixiangContent;
    }
    /**
	 * 设置：办理时间
	 */
    public Date getBanliTime() {
        return banliTime;
    }


    /**
	 * 获取：办理时间
	 */

    public void setBanliTime(Date banliTime) {
        this.banliTime = banliTime;
    }
    /**
	 * 设置：是否办理
	 */
    public Integer getBanliTypes() {
        return banliTypes;
    }


    /**
	 * 获取：是否办理
	 */

    public void setBanliTypes(Integer banliTypes) {
        this.banliTypes = banliTypes;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
