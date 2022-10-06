package com.example.spring.web

import com.example.spring.data.dao.MemberDao
import com.example.spring.data.po.MemberPo
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
@RequestMapping("/api/v1.0/members")
class MemberController(
    private val memberDao: MemberDao,
) {

    @GetMapping
    fun getMember(@RequestParam id: Long): MemberPo =
        memberDao.getById(id)

    @PostMapping
    fun postMember(@RequestBody memberPo: MemberPo): MemberPo =
        memberDao.save(
            memberPo.copy(
                createTime = Instant.now().toEpochMilli()
            )
        )

    @DeleteMapping("/{id}")
    fun deleteMember(@PathVariable id: Long): Unit =
        memberDao.deleteById(id)
}