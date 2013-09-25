package com.base.model;

public class AuthoritiesResources extends BaseModel {
    private Integer id; /*主键*/

    private Integer authoritiesId; /*权限ID*/

    private Integer resourcesId; /*资源ID*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthoritiesId() {
        return authoritiesId;
    }

    public void setAuthoritiesId(Integer authoritiesId) {
        this.authoritiesId = authoritiesId;
    }

    public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }
}
