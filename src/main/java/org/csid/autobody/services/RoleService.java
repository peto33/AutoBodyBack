package org.csid.autobody.services;

import org.csid.autobody.entity.RoleEntity;
import org.csid.autobody.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;
    public RoleEntity findByRoleName(String roleName){
        RoleEntity roleEntity = null;

        try{
            roleEntity = roleRepository.findByRoleName(roleName);
        } catch (Exception e){
            throw e;
        }
        return roleEntity;
    }

    public RoleRepository getRoleRepository() {
        return roleRepository;
    }

}
