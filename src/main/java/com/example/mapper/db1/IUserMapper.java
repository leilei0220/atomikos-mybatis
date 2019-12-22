package com.example.mapper.db1;

import com.example.po.db1.UserPO;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description TODO
 * @Author leilei
 * @Date 2019/12/21 17:20
 */
@Component
public interface IUserMapper extends Mapper<UserPO> {
}
