package com.kaka.gmall.service.impl;



import com.alibaba.dubbo.config.annotation.Service;
import com.kaka.bean.UserAddress;
import com.kaka.service.UserService;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

/**
 * @Author: Yancheng Guo
 * @Date: 2019/1/6 11:56
 * @Description:
 *
 * 	1.导入依赖：
 * 		（1）导入dubbo-stater
 * 	2.配置
 */
@Service
@Component
public class UserServiceImpl implements UserService {



	public List<UserAddress> getAddressList(String userId) {

		UserAddress address1 = new UserAddress("1", "北京市昌平区宏福科技园综合楼3层");
		UserAddress address2 = new UserAddress("2", "深圳市宝安区西部硅谷大厦B座3层（深圳分校）");
		return Arrays.asList(address1,address2);
	}


}
