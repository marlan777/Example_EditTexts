package id.life.marlanhrx64.example_edittexts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToastData.setOnClickListener(){
            var txt2Display=editxtNamaDepan.text.toString() + " " + editxtNamaBelakang.text.toString() + "\n" +
                            "Lahir Di " + editxtTptLahir.text.toString() + " pada " + editxtTglLahir.text.toString() + "\n" +
                            "Tinggal di " + editxtAlamat.text.toString() + "\n" +
                            "Memiliki Email : " + editxtEMail.text.toString() + " dan \n" +
                            "Nomor HP : " + editxtNoHP.text.toString()
            Toast.makeText(this,txt2Display,Toast.LENGTH_LONG).show()
        }

        btnProsesData.setOnClickListener(){
            var intentDisplayData = Intent(this,Main2Activity::class.java)
            intentDisplayData.putExtra("theNama", editxtNamaDepan.text.toString() + " " + editxtNamaBelakang.text.toString() )
            intentDisplayData.putExtra("theTptTglLhr", editxtTptLahir.text.toString() + ", " + editxtTglLahir.text.toString())
            intentDisplayData.putExtra("theAlamat", editxtAlamat.text.toString())
            intentDisplayData.putExtra("theEMail", editxtEMail.text.toString())
            intentDisplayData.putExtra( "theNoHP", editxtNoHP.text.toString())
            startActivity(intentDisplayData)
        }
    }
}
