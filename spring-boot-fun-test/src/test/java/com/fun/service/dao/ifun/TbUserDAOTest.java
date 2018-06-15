/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.fun.service.dao.ifun;

import com.alibaba.fastjson.JSON;
import com.fun.client.domain.dto.TbUserDO;
import com.fun.test.TestBase;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author lujun.xlj
 * @date 2017/4/28
 */
public class TbUserDAOTest extends TestBase{

    @Resource
    private TbUserDAO tbUserDAO;

    @Test
    public void testgetByNick() throws Exception{

        TbUserDO data = tbUserDAO.getByNick("ifun");
        System.out.println(JSON.toJSONString(data));
        Assert.assertTrue("行默".equals(data.getUname()));

    }
}
