package com.duoduo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer uID;
    private String uName;
    private String uPwd;
    private String uPhone;
    private String uAddress;
    private String tID;
}
