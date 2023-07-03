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

package neatlogic.framework.rdm.enums.core;

import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.rdm.enums.AttrType;

import java.util.ArrayList;
import java.util.List;

public interface IAppType extends IEnum<JSONObject> {
    String getName();

    boolean getHasIssue();

    String getLabel();

    String getColor();

    AttrType[] getAttrList();

    IAppType[] getAppType();

    default String getValue() {
        return this.getName();
    }

    default boolean isValid() {
        return true;
    }

    @Override
    default List<JSONObject> getValueTextList() {
        List<JSONObject> array = new ArrayList<>();
        for (IAppType appType : this.getAppType()) {
            array.add(new JSONObject() {
                {
                    this.put("value", appType.getName());
                    this.put("text", appType.getLabel());
                }
            });
        }
        return array;
    }


    @Override
    default String getEnumName() {
        return "nfre.apptype.getenumname";
    }
}
