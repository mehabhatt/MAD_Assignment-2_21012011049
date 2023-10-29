package com.example.mad_assignment_2_21012011049

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.button.MaterialButton

class PersonAdapter (context:Context,  val Doctorarray : ArrayList<Doctor>): ArrayAdapter<Doctor>(context,0,Doctorarray) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view= LayoutInflater.from(context).inflate(R.layout.list_item_doctor, parent, false)
        view.findViewById<TextView>(R.id.name_textView).text =Doctorarray[position].name
        view.findViewById<TextView>(R.id.doct_textView).text= Doctorarray[position].speciality
        val btn = view.findViewById<MaterialButton>(R.id.call_btn)
            btn.setOnClickListener {
            val phoneNumber = "9426500000"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            context.startActivity(intent)
        }
        return view
    }
}