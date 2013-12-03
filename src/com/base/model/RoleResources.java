package com.base.model;

public class RoleResources extends BaseModel {
    private Integer id; /*主键*/

    private Integer roleId; /*角色ID*/

    private Integer resourcesId; /*资源ID*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }
}
