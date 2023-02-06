package cmy.manage.managedal.dao;

import cmy.manage.managedal.entity.ExpireManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: Aquarius
 * @time: 2023/2/6 23:39
 * @description:
 */
@Mapper
public interface ExpireGoodMapper {
    @Select("select * from expire_manage")
    public List<ExpireManage> getList();
}
