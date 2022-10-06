package com.example.spring.data.dao

import com.example.spring.data.po.MemberPo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface MemberDao : CrudRepository<MemberPo, Long> {
}