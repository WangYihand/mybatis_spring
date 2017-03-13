package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.User;

/**
 * User类的mapper（dao）
 */
public interface UserMapper {
	//登录验证程序，传入参数user(id = 0, username = ?, password = ?), 返回值user(id = ?, username = ?, password = ?)
	public User login(User user) throws Exception;

}
