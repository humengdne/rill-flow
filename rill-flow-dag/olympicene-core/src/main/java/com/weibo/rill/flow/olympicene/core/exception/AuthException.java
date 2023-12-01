/*
 *  Copyright 2021-2023 Weibo, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.weibo.rill.flow.olympicene.core.exception;

/**
 * @author xinyu
 * @date 2023/08/15 14:56
 */
public class AuthException extends RuntimeException {

    private final int errorCode;

    public AuthException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public AuthException(int errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public AuthException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}