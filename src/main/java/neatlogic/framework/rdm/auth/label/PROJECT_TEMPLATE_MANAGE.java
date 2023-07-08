/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.rdm.auth.label;

import neatlogic.framework.auth.core.AuthBase;

public class PROJECT_TEMPLATE_MANAGE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "项目模板管理权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "对项目模板进行添加、修改、删除操作，把项目另存为项目模板。";
    }

    @Override
    public String getAuthGroup() {
        return "rdm";
    }

    @Override
    public Integer getSort() {
        return 3;
    }
}
