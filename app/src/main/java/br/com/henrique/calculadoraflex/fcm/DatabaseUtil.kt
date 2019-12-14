package br.com.henrique.calculadoraflex.fcm

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class DatabaseUtil   {

    fun  saveToken(token: String?) {
        val user = FirebaseAuth.getInstance().currentUser?.uid ?: ""
        if (user != "") {
            FirebaseDatabase.getInstance().getReference("UsersTokens")
                .child(FirebaseAuth.getInstance().currentUser?.uid ?: "")
                .setValue(token)
        }
    }

}