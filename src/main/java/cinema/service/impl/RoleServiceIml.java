package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceIml implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceIml(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).get();
    }
}
