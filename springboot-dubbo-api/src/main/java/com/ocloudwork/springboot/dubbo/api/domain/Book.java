/*
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Book
 * Author:   minghui
 * Date:     2019/03/18 11:31
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ocloudwork.springboot.dubbo.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author minghui
 * @create 2019/03/18
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class Book implements Serializable {
    private static final long serialVersionUID = -5724156443645146494L;
    private Integer id;
    private String name;

}
