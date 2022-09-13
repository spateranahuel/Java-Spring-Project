package com.alkemy.ong.service;

import com.alkemy.ong.dto.MemberDTO;

import java.util.List;

public interface MemberService {

    List<MemberDTO> getAllMembers();

    MemberDTO saveMember(MemberDTO memberDTO);

    void deleteMember(String id);

    MemberDTO updateMember(String id, MemberDTO memberDTO);
}
