package com.etc.feigninters;

import com.etc.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author huge
 * @date 2020/10/22 - 20:49
 */
@FeignClient(name = "springuser")   //要调用的服务名
public interface ManagerFeignClient {
    @RequestMapping(value = "/user/findalluser" , method= RequestMethod.GET)
    public List<User> findAllUser();
    @RequestMapping(value = "/user/findusers" , method = RequestMethod.GET)
    public Page<User> findAllByPage(@PageableDefault(value = 10, sort = { "id" }, direction = Sort.Direction.ASC)Pageable pageable);
}
