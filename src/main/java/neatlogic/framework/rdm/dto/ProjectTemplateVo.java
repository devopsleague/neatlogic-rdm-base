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

package neatlogic.framework.rdm.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.rdm.enums.core.AppTypeManager;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class ProjectTemplateVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "common.name", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "common.isactive", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "nfrd.projecttemplatevo.entityfield.name.apptypelist", type = ApiParamType.JSONARRAY)
    private List<ProjectTemplateAppTypeVo> appTypeList;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public List<ProjectTemplateAppTypeVo> getAppTypeList() {
        if (CollectionUtils.isNotEmpty(appTypeList)) {
            appTypeList.removeIf(d -> !AppTypeManager.isContain(d.getAppType()));
        }
        return appTypeList;
    }

    public void setAppTypeList(List<ProjectTemplateAppTypeVo> appTypeList) {
        this.appTypeList = appTypeList;
    }
}
