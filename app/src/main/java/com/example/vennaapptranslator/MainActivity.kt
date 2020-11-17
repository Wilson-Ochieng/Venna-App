package com.example.vennaapptranslator

import android.R
import android.content.Intent
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.bold
import com.example.vennaapptranslator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var TAG : String = "Main Activity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        var goodMorning : String = "Good Morning"
        var beautiful : String = "Beautiful"
        var you : String = "You"
        var chairperson : String = "Chairperson"
        var love : String = "Love"
        var girl : String = "Girl"
        Log.d(TAG, "GOOD MORNING TO LOWERCASE IS: " + goodMorning.toLowerCase())
        setContentView(binding.root)
        binding.clickbtn.setOnClickListener {
            val englishtxt: String = binding.english.text.toString().toLowerCase()
            when (englishtxt) {
                goodMorning.toLowerCase() -> binding.luo.text = "Oyaore"
                beautiful.toLowerCase() -> binding.luo.text = "Jaber"
                you.toLowerCase() -> binding.luo.text = "Omera"
                chairperson.toLowerCase() -> binding.luo.text = "Jakom"
                girl.toLowerCase() -> binding.luo.text = "Nyako"
                love.toLowerCase() -> binding.luo.text = "hera" }



        }
        }

    fun shareText(view: View) {

        var english_txt: String = binding.english.getText().toString().toUpperCase()
        var luo_txt: String = binding.luo.getText().toString().toUpperCase()
        val e = SpannableStringBuilder()
            .bold { append(english_txt) }
        /*Create an ACTION_SEND Intent*/

        /*Create an ACTION_SEND Intent*/
        val intent = Intent(Intent.ACTION_SEND)
        /*This will be the actual content you wish you share.*/
        /*This will be the actual content you wish you share.*/
        val shareBody = "Translation from English to Luo Language: \n" +
                "*"+english_txt+"* -> *"+luo_txt+"*"
        val shareSubject = "VennaApp"
        /*The type of the content is text, obviously.*/
        /*The type of the content is text, obviously.*/intent.type = "text/plain"
        /*Applying information Subject and Body.*/
        /*Applying information Subject and Body.*/intent.putExtra(
            Intent.EXTRA_SUBJECT,shareSubject
        )
        intent.putExtra(Intent.EXTRA_TEXT, shareBody)
        /*Fire!*/
        /*Fire!*/startActivity(Intent.createChooser(intent, "share using"))
    }
}









