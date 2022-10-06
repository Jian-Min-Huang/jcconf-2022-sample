package com.example.quarkus.web

import com.example.quarkus.data.dao.MemberDao
import com.example.quarkus.data.po.MemberPo
import java.time.Instant
import javax.transaction.Transactional
import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/api/v1.0/members")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class MemberController(
    private val memberDao: MemberDao,
) {

    @GET
    fun getMember(@QueryParam("id") id: Long) =
        memberDao.findById(id)!!

    @POST
    @Transactional
    fun postMember(memberPo: MemberPo) =
        memberDao.persist(
            memberPo.copy(
                createDate = Instant.now().toEpochMilli()
            )
        )

    @Path("/{id}")
    @DELETE
    @Transactional
    fun deleteMember(@PathParam("id") id: Long) =
        memberDao.deleteById(id)
}