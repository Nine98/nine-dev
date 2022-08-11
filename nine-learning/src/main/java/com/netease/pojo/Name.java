package com.netease.pojo;

import com.mysql.jdbc.StringUtils;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.xml.bind.ValidationException;

/**
 * TODO description
 *
 * @author chenxueping02
 * @date 2022/07/31
 */
@Data
@Builder
@NoArgsConstructor
public class Name {
    private String name;
    public Name(String name){
        if (StringUtils.isEmptyOrWhitespaceOnly(name)) {
            try {
                throw new ValidationException("name 格式错误");
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
    }
}
