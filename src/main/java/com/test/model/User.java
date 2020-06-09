package com.test.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
public class User {
    private String name ;  //用户名
    private String address ;  //地址
}
