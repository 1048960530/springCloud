package com.demo.client.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author whu
 * @Description: TODO
 * @date 2018/12/26
 */
@Getter
@Setter
@AllArgsConstructor
public class MessageCenterException extends RuntimeException {
    private Exception exception;
    private APIResponse apiResponse;
}