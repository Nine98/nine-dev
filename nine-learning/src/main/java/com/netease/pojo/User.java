package com.netease.pojo;

import lombok.*;

/**
 * TODO description
 *
 * @author chenxueping02
 * @date 2022/07/31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    UserId userId;
    Name name;
    Address address;
    PhoneNumber phoneNumber;
}


