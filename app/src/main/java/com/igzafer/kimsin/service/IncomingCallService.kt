package com.igzafer.kimsin.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast


class IncomingCallService:BroadcastReceiver() {
    override fun onReceive(p0: Context?, intent: Intent?) {
       Log.d("winter","Receiver start $intent")


    }

}