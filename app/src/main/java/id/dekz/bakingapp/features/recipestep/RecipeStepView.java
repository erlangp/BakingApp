package id.dekz.bakingapp.features.recipestep;

import id.dekz.bakingapp.basemvp.BaseView;
import id.dekz.bakingapp.model.Recipe;

/**
 * Created by DEKZ on 7/4/2017.
 */

public interface RecipeStepView extends BaseView {
    void bindData(Recipe recipe);
}