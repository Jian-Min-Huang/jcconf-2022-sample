package com.example.spring.data.po

import com.example.spring.data.enu.Gender
import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "member")
data class MemberPo(

    @Id
    @GeneratedValue
    val id: Long?,

    var name: String,

    var age: Int,

    @Enumerated(value = EnumType.STRING)
    var gender: Gender,

    var balance: BigDecimal,

    var createDate: Long?,
)
