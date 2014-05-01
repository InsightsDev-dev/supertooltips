/*
 * Copyright 2013 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nhaarman.supertooltips;

import android.graphics.Typeface;
import android.view.View;

public class ToolTip {

    public enum AnimationType {
        FROM_MASTER_VIEW,
        FROM_TOP,
        NONE
    }

    private CharSequence text;
    private int textResId;
    private int color;
    private int textColor;
    private View contentView;
    private AnimationType animationType;
    private boolean shadow;
    private Typeface typeface;

    /**
     * Creates a new ToolTip without any values.
     */
    public ToolTip() {
        text = null;
        typeface = null;
        textResId = 0;
        color = 0;
        contentView = null;
        animationType = AnimationType.FROM_MASTER_VIEW;
    }

    /**
     * Set the text to show. Has no effect when a content View is set using setContentView().
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withText(CharSequence text) {
        this.text = text;
        this.textResId = 0;
        return this;
    }

    /**
     * Set the text resource id to show. Has no effect when a content View is set using setContentView().
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withText(int resId) {
        this.textResId = resId;
        this.text = null;
        return this;
    }

    /**
     * Set the text resource id to show and the custom typeface for that view. Has no effect when a content View is set using setContentView().
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withText(int resId, Typeface tf) {
        this.textResId = resId;
        this.text = null;
        this.withTypeface(tf);
        return this;
    }

    /**
     * Set the color of the ToolTip. Default is white.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withColor(int color) {
        this.color = color;
        return this;
    }

    /**
     * Set the text color of the ToolTip. Default is white.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withTextColor(int color){
        this.textColor = color;
        return this;
    }

    /**
     * Set a custom content View for the ToolTip. This will cause any text that has been set to be ignored.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withContentView(View view) {
        this.contentView = view;
        return this;
    }

    /**
     * Set the animation type for the ToolTip. Defaults to {@link AnimationType#FROM_MASTER_VIEW}.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withAnimationType(AnimationType animationType) {
        this.animationType = animationType;
        return this;
    }

    /**
     * Set whether to show a shadow below the ToolTip.
     *
     * @return this ToolTip to build upon.
     */
    public ToolTip withShadow(boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    /**
     * @param typeface the typeface to set
     */
    public void withTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public CharSequence getText() {
        return text;
    }

    public int getTextResId() {
        return textResId;
    }

    public int getColor() {
        return color;
    }

    public int getTextColor() {
        return textColor;
    }

    public View getContentView() {
        return contentView;
    }

    public AnimationType getAnimationType() {
        return animationType;
    }

    public boolean getShadow() {
        return shadow;
    }

    /**
     * @return the typeface
     */
    public Typeface getTypeface() {
        return typeface;
    }
}
