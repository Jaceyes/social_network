package com.zjiet.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Postmessage extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "postmessageid", type = IdType.AUTO)
    private Integer postmessageid;

    private String context;

    private String username;

    private Integer likenum;

    private Integer sharenum;

    private LocalDate createtime;


}
