package com.netease.controller;

import com.netease.pojo.*;
import lombok.NonNull;

import javax.xml.bind.ValidationException;

/**
 * TODO description
 *
 * @author chenxueping02
 * @date 2022/07/31
 */
public class RegisterController {
    public static void main(String[] args) throws ValidationException {
        Name name = Name.builder().name("cxp").build();
        PhoneNumber number = PhoneNumber.builder().number("15776552814").build();
        Address address = Address.builder().address("杭州").build();

        User user = register(name, number, address);
        System.out.println(user.getName());
        System.out.println(user.getAddress());
        System.out.println(user.getPhoneNumber());
    }

    public static User register(Name name,
                                PhoneNumber phoneNumber,
                                Address address){
        User user = User.builder()
                .address(address)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
//        User user1 = new User();
//        user1.setName(name);
//        user1.setPhoneNumber(phoneNumber);
//        user1.setAddress(address);
        return user;
    }


}
