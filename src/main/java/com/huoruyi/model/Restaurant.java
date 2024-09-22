package com.huoruyi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Restaurant {
    private String name;        // 餐厅名称
    private String location;    // 餐厅位置
    private String specialty;   // 餐厅特色

}