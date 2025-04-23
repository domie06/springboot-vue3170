package com.entity.vo;

import com.entity.JishibenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 记事本
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jishiben")
public class JishibenVO implements Serializable {
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
     * 记事本标题
     */

    @TableField(value = "jishiben_name")
    private String jishibenName;


    /**
     * 记事本类型
     */

    @TableField(value = "jishiben_types")
    private Integer jishibenTypes;


    /**
     * 记事本内容
     */

    @TableField(value = "jishiben_content")
    private String jishibenContent;


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
	 * 设置：记事本标题
	 */
    public String getJishibenName() {
        return jishibenName;
    }


    /**
	 * 获取：记事本标题
	 */

    public void setJishibenName(String jishibenName) {
        this.jishibenName = jishibenName;
    }
    /**
	 * 设置：记事本类型
	 */
    public Integer getJishibenTypes() {
        return jishibenTypes;
    }


    /**
	 * 获取：记事本类型
	 */

    public void setJishibenTypes(Integer jishibenTypes) {
        this.jishibenTypes = jishibenTypes;
    }
    /**
	 * 设置：记事本内容
	 */
    public String getJishibenContent() {
        return jishibenContent;
    }


    /**
	 * 获取：记事本内容
	 */

    public void setJishibenContent(String jishibenContent) {
        this.jishibenContent = jishibenContent;
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
