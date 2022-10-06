package com.example.spring.data.dao

import com.example.spring.data.po.MemberPo
import org.springframework.data.repository.CrudRepository

interface MemberDao : CrudRepository<MemberPo, Long> {
}