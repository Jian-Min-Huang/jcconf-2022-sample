package com.example.quarkus.data.dao

import com.example.quarkus.data.po.MemberPo
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MemberDao : PanacheRepository<MemberPo> {
}