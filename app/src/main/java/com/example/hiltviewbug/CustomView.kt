package com.example.hiltviewbug

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.annotation.AttrRes
import androidx.annotation.StyleRes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = 0,
    @StyleRes defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    private fun methodCausesProblems(): LinearLayout {
        return LinearLayout(context)
    }
}