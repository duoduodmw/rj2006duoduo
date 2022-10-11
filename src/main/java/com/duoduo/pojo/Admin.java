package com.duoduo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer AID;
    private String AName;
    private String APwd;
}
