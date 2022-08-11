package com.netease.pojo;

import com.mysql.jdbc.StringUtils;
import lombok.*;

import javax.xml.bind.ValidationException;
import java.util.Arrays;

/**
 * TODO description
 *
 * @author chenxueping02
 * @date 2022/07/31
 */
@Data
@Builder
@NoArgsConstructor
public class PhoneNumber {
    private String number;
    public PhoneNumber(String number){
        try {
            if (StringUtils.isEmptyOrWhitespaceOnly(number)) {
                throw new ValidationException("phone number 不能为空");
            }else if (isValid(number)){
                throw new ValidationException("phone number 格式错误");
            }
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        this.number = number;
    }

    public String getAreaCode(){
        for (int i = 0; i < number.length(); i++) {
            String prefix = number.substring(0,i);
            if (isAreaCode(prefix)){
                return prefix;
            }
        }
        return null;
    }

    private static boolean isAreaCode(String prefix){
        String[] areas = {"0827", "010", "021"};
        return Arrays.asList(areas).contains(prefix);
    }


    private static boolean isValid(String number){
        String pattern = "^0?[1-9]{2,3}-?\\d{8}$";
        return number.matches(pattern);
    }

}
