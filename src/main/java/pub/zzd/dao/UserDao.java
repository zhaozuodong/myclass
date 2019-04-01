package pub.zzd.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pub.zzd.pojo.UserInfo;

import java.util.List;

/**
 * @Description : 数据操作层
 * @Author : ZZD
 * @CreateTime : 2019/4/1 17:00
 */
public interface UserDao {
    @Select("select * from t_user_info")
    List<UserInfo> listUserInfos();
    @Select("select user_id,user_name from t_user_info where user_id = #{user_id}")
    UserInfo getUserInfoByUserId(@Param("user_id") Integer user_id);
}
