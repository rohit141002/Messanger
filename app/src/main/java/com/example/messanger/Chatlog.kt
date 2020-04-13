package com.example.messanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messanger.models.User
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class Chatlog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatlog)
        val user = intent.getParcelableExtra<User>(NewMessage.USER_KEY)

        supportActionBar?.title=user.username
    }
}
class ChatFromitem: Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
         return R.layout.chat_from_row
    }
}
class Chattoitem: Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
        return R.layout.chat_to_row
    }
}