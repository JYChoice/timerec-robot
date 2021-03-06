package com.timerec.robot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.timerec.robot.entity.Capsule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RobotMapper extends BaseMapper<Capsule>{

    int getCapsTotal();

    int checkCaps(@Param("capsule")  Capsule capsule);

}
