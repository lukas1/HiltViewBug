package com.example.hiltviewbug

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.annotation.AttrRes
import androidx.annotation.StyleRes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CustomView2 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = 0,
    @StyleRes defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {
    private fun methodCausesProblems(): FrameLayout {
        return FrameLayout(context)
    }
}