package com.example.mapper.db2;

import com.example.po.db2.GradePO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description TODO
 * @Author leilei
 * @Date 2019/12/21 17:20
 */
@Component
public interface IGradeMapper extends Mapper<GradePO> {

    @Select("select * from grade where id = #{userId}")
    GradePO getGradeByUserId(String userId);
}
