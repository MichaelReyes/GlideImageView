package com.custom.customimageview

import android.content.Context
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.util.AttributeSet

import com.bumptech.glide.Glide

import java.io.File

import de.hdodenhof.circleimageview.CircleImageView


class GlideCircleImageView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : CircleImageView(context, attrs, defStyle) {

    fun setImageUrl(imageUrl: String?) {
        if (imageUrl == null)
            return
        GlideApp.with(context)
            .load(imageUrl)
            .into(this)
    }

    fun setImageUrlWithPlaceholder(imageUrl: String?, placeholder: Drawable) {
        if (imageUrl == null)
            return
        GlideApp.with(context)
            .load(imageUrl)
            .placeholder(placeholder)
            .into(this)
    }

    fun setImageUrlNoPlaceholder(imageUrl: String?) {
        if (imageUrl == null)
            return
        GlideApp.with(context)
            .load(imageUrl)
            .into(this)
    }

    fun setImageFile(file: File) {
        GlideApp.with(context)
            .load(file)
            .into(this)
    }

    fun setImageFileWithPlaceholder(file: File, placeholder: Drawable) {
        GlideApp.with(context)
            .load(file)
            .placeholder(placeholder)
            .into(this)
    }

    fun setImageDrawable(drawable: Drawable, placeholder: Drawable) {
        GlideApp.with(context)
            .load(drawable)
            .into(this)
    }

    fun setImageBitmap(bitmap: Bitmap, placeholder: Drawable) {
        GlideApp.with(context)
            .load(bitmap)
            .placeholder(placeholder)
            .into(this)
    }
}
