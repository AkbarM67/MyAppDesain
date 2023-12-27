package com.example.myappdesain.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myappdesain.data.model.Tours
import com.example.myappdesain.databinding.ItemRowTourBinding
import com.example.myappdesain.ui.detail.DetailActivity

class TourListAdapter(private val listTour: List<Tours>) : RecyclerView.Adapter<TourListAdapter.TourListViewHolder>() {
    class TourListViewHolder(binding: ItemRowTourBinding) : RecyclerView.ViewHolder(binding.root) {

        val imageTour = binding.imgTour
        val tvNameTour = binding.tvNameTour
        val tvRatingTour = binding.tvRatingTour
        val tvTimeTour = binding.tvTime

        fun bind(tours: Tours) {
            imageTour.setImageResource(tours.picture)
            tvNameTour.text = tours.name
            tvRatingTour.text = tours.rating.toString()
            tvTimeTour.text = tours.ticket.toString()

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_Tour, tours)
                itemView.context.startActivity(intent)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourListViewHolder {
        val binding = ItemRowTourBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TourListViewHolder(binding)
    }

    override fun getItemCount(): Int = listTour.size

    override fun onBindViewHolder(holder: TourListViewHolder, position: Int) {
        holder.bind(listTour[position])

    }
}