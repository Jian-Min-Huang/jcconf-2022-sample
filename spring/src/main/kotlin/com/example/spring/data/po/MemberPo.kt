package com.example.spring.data.po

import com.example.spring.data.enu.Gender
import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class MemberPo(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    var name: String,

    var age: Int,

    var gender: Gender,

    var balance: BigDecimal,

    var createTime: Long?,
)
