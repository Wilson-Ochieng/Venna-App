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
        var disease: String = "Disease"
        var patient: String = "Patient"
        var tree: String = "Tree"
        var road: String = "Road"
        var house: String = "House"
        var sister: String = "Sister"
        var brother : String = "Brother"
        var mum : String = "Mum"
        var dad : String = "Dad"
        var jesus : String = "Jesus"
        var god : String = "God"
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
                disease.toLowerCase() -> binding.luo.text = "Tuo"
                patient.toLowerCase() -> binding.luo.text = "Jatuo"
                tree.toLowerCase() -> binding.luo.text = "Yien"
                road.toLowerCase() -> binding.luo.text = "Ndara"
                house.toLowerCase() -> binding.luo.text = "Ot"
                sister.toLowerCase() -> binding.luo.text = "Nyamera"
                brother.toLowerCase() -> binding.luo.text = "Owadwa"
                dad.toLowerCase() -> binding.luo.text = "Baba"
                mum.toLowerCase() -> binding.luo.text = "Mama"
                jesus.toLowerCase() -> binding.luo.text = "Yesu"
                god.toLowerCase() -> binding.luo.text = "Nyasaye"
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









