package com.db.tradestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.tradestore.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>
{
}
