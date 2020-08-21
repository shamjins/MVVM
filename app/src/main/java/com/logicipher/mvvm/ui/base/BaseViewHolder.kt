package com.logicipher.mvvm.ui.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Shamji N S on 20-08-2020.
 */
abstract class BaseViewHolder(itemView: View?) :
    RecyclerView.ViewHolder(itemView!!) {
    abstract fun onBind(position: Int)
}
