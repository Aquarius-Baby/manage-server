package cmy.manage.manageservice.service.expireMange;

import cmy.manage.managedal.dao.ExpireGoodMapper;
import cmy.manage.managedal.entity.ExpireManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Aquarius
 * @time: 2023/2/6 23:40
 * @description:
 */
@Service
public class ExpireManageService {

    @Autowired
    ExpireGoodMapper expireGoodMapper;

    public List<ExpireManage> getList() {
        return expireGoodMapper.getList();
    }
}
