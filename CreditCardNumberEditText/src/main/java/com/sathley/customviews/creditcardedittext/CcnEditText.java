package com.sathley.customviews.creditcardedittext;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by sathley on 7/26/2014.
 */
public class CcnEditText extends EditText implements CcnValidation {

    private CcnValidator validator = new CcnValidator();

    public CcnEditText(Context context) {
        super(context);
    }

    public CcnEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CcnEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public CcnTypeEnum validate() {
        return validator.validate(this.getText().toString());
    }
}
