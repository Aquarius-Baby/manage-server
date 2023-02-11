package cmy.manage.managestart.api;

import cmy.manage.managedal.common.result.BaseResult;
import cmy.manage.managedal.entity.ExpireManage;
import cmy.manage.manageservice.service.expireMange.ExpireManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Aquarius
 * @time: 2023/2/6 23:42
 * @description:
 */
@RestController
@RequestMapping("/api/expire")
public class ExpireManageController {

    @Autowired
    ExpireManageService expireManageService;

    @GetMapping("/list")
    public BaseResult<List<ExpireManage>> getList() {
        return BaseResult.success(expireManageService.getList());
    }
}
