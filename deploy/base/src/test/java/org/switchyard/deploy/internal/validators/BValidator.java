/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.switchyard.deploy.internal.validators;

import org.switchyard.validate.BaseValidator;
import org.switchyard.validate.ValidationResult;

import javax.xml.namespace.QName;

/**
 * @author <a href="mailto:tm.igarashi@gmail.com">Tomohisa Igarashi</a>
 */
public class BValidator extends BaseValidator {

    public BValidator() {
        super(new QName("B"));
    }

    @Override
    public ValidationResult validate(Object obj) {
        if (obj != null) {
            return validResult();
        } else {
            return invalidResult("obj == null");
        }
    }
}
