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
package com.ocloudwork.springboot.dubbo.api.service;

import com.ocloudwork.springboot.dubbo.api.domain.Book;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author minghui
 * @create 2019/03/18
 * @since 1.0.0
 */
public interface IBookService {
    /**ØØ
     * 查询book
     */
    Book findBook(String name);
}
