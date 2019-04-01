package pub.zzd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.zzd.dao.UserDao;
import pub.zzd.pojo.UserInfo;
import pub.zzd.service.UserService;

import java.util.List;

/**
 * @Description : 业务逻辑层实现类
 * @Author : ZZD
 * @CreateTime : 2019/4/1 17:02
 */
@Service()
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<UserInfo> listUserInfos() {
        return userDao.listUserInfos();
    }

    @Override
    public UserInfo getUserInfoByUserId(Integer user_id) {
        return userDao.getUserInfoByUserId(user_id);
    }
}
