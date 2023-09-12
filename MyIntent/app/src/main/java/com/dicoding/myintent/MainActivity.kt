package com.dicoding.myintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvResult: TextView
    private var resultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ){
        result ->
        if(result.resultCode == MoveForResultActivity. RESULT_CODE && result.data != null){
            val selectedValue =
                result.data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)
            tvResult.text = "Result : $selectedValue"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnMoveWithObject: Button = findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnMoveForResult: Button = findViewById(R.id.btn_move_with_result)
        btnMoveForResult.setOnClickListener(this)

        tvResult = findViewById(R.id.tv_result)

        val btnMoveTesting: Button = findViewById(R.id.btn_move_to_testing)
        btnMoveTesting.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_move_activity-> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data->{
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Asiah")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 16)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_move_activity_object->{
                val person = Person(
                    "Asiah",
                    16,
                    "asiahbintiendro@gmail.com",
                    "North Jakarta"
                )
                val moveWithObjectActivity = Intent(this@MainActivity,
                    MoveWithObjectActivity::class.java)
                moveWithObjectActivity.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveWithObjectActivity)
            }

            // implisit
            R.id.btn_dial_number -> {
                val phoneNumber = "08139000834"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tell: $phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            R.id.btn_move_with_result -> {
                val moveForResultIntent = Intent(this@MainActivity, MoveForResultActivity::class.java)
                resultLauncher.launch(moveForResultIntent)
            }

            R.id.btn_move_to_testing -> {
                val moveIntentTesting = Intent(this@MainActivity, TestingActivity::class.java)
                startActivity(moveIntentTesting)
            }
        }
    }
}