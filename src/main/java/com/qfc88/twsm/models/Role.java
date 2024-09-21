package com.qfc88.twsm.models;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    private String authority;

    public Role() {
        super();
    }
    public Role(int roleId, String authority) {
        super();
        this.roleId = roleId;
        this.authority = authority;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }


    @Override
    public String toString() {
        return "Role [roleId=" + roleId + ", authority=" + authority + "]";
    }
}
