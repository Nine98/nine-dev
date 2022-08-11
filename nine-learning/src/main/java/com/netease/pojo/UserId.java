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
public class UserId {
    private Long userId;
    public UserId(Long userId){
        this.userId = userId;
    }

}
