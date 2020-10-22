package com.example.madlevel3example

import kotlinx.android.synthetic.main.item_reminder.view.*


import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ReminderAdapter(private val reminders: List<Reminder>) : RecyclerView.Adapter<ReminderAdapter.ViewHolder>(){


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //val binding = ItemReminderBinding.bind(itemView)

        fun databind(reminder: Reminder) {
            itemView.tvReminder.text = reminder.reminderText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}