package cn.sakura.securitydemo.service;

import cn.sakura.securitydemo.mapper.SysRoleMapper;
import cn.sakura.securitydemo.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id) {
        return roleMapper.selectById(id);
    }

}
