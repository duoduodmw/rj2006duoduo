package com.duoduo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Good {
    private Integer gID;
    private String gName;
    private String gPrice;
    private String gContent;
    private Integer sID;
}
