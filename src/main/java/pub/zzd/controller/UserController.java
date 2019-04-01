package pub.zzd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pub.zzd.pojo.UserInfo;
import pub.zzd.service.UserService;

import java.util.List;

/**
 * @Description : 同学信息控制器
 * @Author : ZZD
 * @CreateTime : 2019/4/1 16:59
 */
@Controller
@EnableAutoConfiguration
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("listUserInfos")
    @ResponseBody
    public List<UserInfo> listUserInfos(){
        List<UserInfo> list = userService.listUserInfos();
        return list;
    }

    /**
     * 根据user_id获取user信息
     * @param user_id 入参
     * @return
     */
    @GetMapping("getUserInfoByUserId")
    @ResponseBody
    public UserInfo getUserInfoByUserId(@RequestParam("user_id")Integer user_id){
        UserInfo userInfo = userService.getUserInfoByUserId(user_id);
        return userInfo;
    }

    /**
     * 更新去向登记表
     * @param user_id
     * @return
     */
    @GetMapping("updateRegistration")
    @ResponseBody
    public Integer updateRegistration(@RequestParam("user_id")Integer user_id){
        //
        return 1;
    }



}
