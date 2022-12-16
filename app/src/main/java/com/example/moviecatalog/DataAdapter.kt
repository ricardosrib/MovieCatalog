package com.example.moviecatalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalog.models.DataPattern
import kotlinx.android.synthetic.main.visual_container.view.*

class DataAdapter(private val onClicked: (DataPattern) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var list: List<DataPattern>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.visual_container, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileViewHolder -> {
                holder.bind(list[position], onClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun dataSet(items: List<DataPattern>) {
        this.list = items
    }

    class ProfileViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        private val profileTitle = itemView.title
        private val profileType = itemView.type
        private val profileRelease = itemView.release
        private val profileImage = itemView.image

        fun bind(profile: DataPattern, onClicked: (DataPattern) -> Unit) {
            profileTitle.text = profile.title
            profileType.text = profile.type
            profileRelease.text = profile.release
            profileImage.setImageResource(profile.image)

            itemView.setOnClickListener {
                onClicked(profile)
            }
        }
    }

}