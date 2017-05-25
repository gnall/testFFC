/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package washo.gmd.app.client.local.page.profile.build;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.WavesType;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import washo.gmd.app.client.local.page.base.Page;

import javax.inject.Inject;

@Templated
@org.jboss.errai.ui.nav.client.local.Page(path = "profile_build")
public class ProfileBuildPage extends Page {

    @Inject
    @DataField
    MaterialLabel title, description;

    @Inject
    @DataField
    MaterialTextBox name, country, zipCode, gender;

    @Inject
    @DataField
    MaterialAnchorButton validate, back;

    @Override
    public void onPostConstruct() {
        super.onPostConstruct();

        setId("profile-build");

        title.setText("Sign Up");
        description.setText("Build now your profile");

        name.setLabel("Name");
        name.setPlaceholder("e.g John Doe");
        country.setLabel("Country");
        country.setPlaceholder("e.g USA");
        zipCode.setLabel("Zip Code");
        zipCode.setPlaceholder("e.g 123A3");
        gender.setLabel("Gender");
        gender.setPlaceholder("e.g Male");

        validate.setText("Validate");
        validate.setWaves(WavesType.DEFAULT);
        validate.setMargin(12);
        validate.setBackgroundColor(Color.DEEP_PURPLE);
        validate.setWidth("80%");

        validate.addClickHandler(clickEvent -> {
            MaterialToast.fireToast("TODO Save to Database");
        });

        back.setText("Sign In");
        back.setWaves(WavesType.DEFAULT);
        back.setType(ButtonType.FLAT);
        back.setWidth("80%");

        back.setHref("#login");
    }
}
