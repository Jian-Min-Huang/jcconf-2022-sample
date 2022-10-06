package com.example.spring.data.dao

import com.example.spring.data.po.MemberPo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface MemberDao : JpaRepository<MemberPo, Long>, JpaSpecificationExecutor<MemberPo> {
}