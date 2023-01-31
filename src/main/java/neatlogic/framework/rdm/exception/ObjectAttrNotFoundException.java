/*
 * Copyright(c) 2023 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.rdm.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class ObjectAttrNotFoundException extends ApiRuntimeException {

    public ObjectAttrNotFoundException(Long id) {
        super("属性“" + id + "”不存在");
    }
}
