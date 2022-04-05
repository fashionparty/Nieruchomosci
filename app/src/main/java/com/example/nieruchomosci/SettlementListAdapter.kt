package com.example.nieruchomosci

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView

class SettlementListAdapter(private val context: Context, private val list: List<FakeSettlements>)
    : RecyclerView.Adapter<SettlementListAdapter.SettlementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettlementListAdapter.SettlementViewHolder {
        return SettlementViewHolder(LayoutInflater.from(context).inflate(R.layout.item_settlement,parent,false))
    }

    override fun onBindViewHolder(holder: SettlementViewHolder, position: Int) {
        val element = list[position]
        holder.tvHeader.text = element.month
        holder.tvHeaderDate.text = element.date
        holder.tvDueDate.text = element.dueDate
        holder.tvBalance.text = element.balance
        holder.tvBill.text = element.bill
        holder.tvPayment.text = element.payment
        holder.tvToPay.text = element.toPay

        if(element.isSettled) holder.ivIsSettled.setImageResource(R.drawable.ic_check_box_black_24dp)
        else holder.ivIsSettled.setImageResource(R.drawable.ic_disabled_by_default_black_24dp)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class SettlementViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvHeader: TextView = view.findViewById(R.id.tv_header)
        val tvHeaderDate: TextView = view.findViewById(R.id.tv_header_date)
        val tvDueDate: TextView = view.findViewById(R.id.tv_duedate_value)
        val tvBalance: TextView = view.findViewById(R.id.tv_balance_value)
        val tvBill: TextView = view.findViewById(R.id.tv_bill_value)
        val tvPayment: TextView = view.findViewById(R.id.tv_payment_value)
        val tvToPay: TextView = view.findViewById(R.id.tv_topay_value)
        val ivIsSettled: ImageView = view.findViewById(R.id.iv_is_settled_image)
    }




}