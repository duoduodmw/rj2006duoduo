package com.duoduo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private Integer sID;
    private String sName;
    private String sAddress;
    private String sPhone;
    private Integer uID;
}
