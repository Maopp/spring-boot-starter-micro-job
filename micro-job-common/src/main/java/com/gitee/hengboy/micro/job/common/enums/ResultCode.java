/*
 * Copyright 2019 恒宇少年
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.gitee.hengboy.micro.job.common.enums;

import lombok.Getter;

/**
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2019-01-05
 * Time：14:57
 * 个人博客：http://blog.yuqiyu.com
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@Getter
public enum ResultCode {
    /**
     * 执行成功
     */
    SUCCESS(200),
    /**
     * 执行失败，不执行重试
     */
    ERROR(500),
    /**
     * 删除任务
     */
    REMOVE(501),
    /**
     * 执行失败，进行重试
     */
    RETRY(201);
    private int code;

    ResultCode(int code) {
        this.code = code;
    }}
