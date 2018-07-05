package id.life.marlanhrx64.example_edittexts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txtNama.setText( intent.extras.getString("theNama") )
        txtAlamat.setText( intent.extras.getString("theAlamat"))
        txtTTLhr.setText( intent.extras.getString("theTptTglLhr"))
        txtEMail.setText( intent.extras.getString("theEMail"))
        txtNoHP.setText(intent.extras.getString("thxNoHP"))

        btnBackToMain.setOnClickListener() {
            var intentBack2Main = Intent(this,MainActivity::class.java)
            startActivity(intentBack2Main)
        }
    }
}
