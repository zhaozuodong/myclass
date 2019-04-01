package pub.zzd.service;

import pub.zzd.pojo.UserInfo;

import java.util.List;

/**
 * @Description : 业务逻辑层接口
 * @Author : ZZD
 * @CreateTime : 2019/4/1 17:01
 */
public interface UserService {
    List<UserInfo> listUserInfos();

    UserInfo getUserInfoByUserId(Integer user_id);
}
