package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
    private int mno;
    private String username;
    private String password;
    private String korName;
    private String email;
    private String role;
    private Timestamp createDate;

    private String provider;    //OAuth 지원 회사
    private String providerId;  //OAuth 지원 회사에서 사용하는 ID
}
