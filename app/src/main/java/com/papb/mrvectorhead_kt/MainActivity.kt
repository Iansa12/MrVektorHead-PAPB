package com.papb.mrvectorhead_kt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

private const val imgCode = 1234
private var iv_status: String = ""
class MainActivity : AppCompatActivity() {
    var imgUrihead: Uri? = null
    var imgUrihair: Uri? = null
    var imgUrimoustache: Uri? = null
    var imgUrieyes: Uri? = null
    var imgUrieyebrow: Uri? = null
    var imgUribeard: Uri? = null
    var IVhead: ImageView? = null
    var IVhair: ImageView? = null
    var IVmoustache1: ImageView? = null
    var IVeyes: ImageView? = null
    var IVeyebrow: ImageView? = null
    var IVbeard: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        IVhead = findViewById(R.id.iv_head)
        IVhair = findViewById(R.id.iv_hair)
        IVmoustache1 = findViewById(R.id.iv_moustache1)
        IVeyes = findViewById(R.id.iv_eyes)
        IVeyebrow = findViewById(R.id.iv_eyebrow)
        IVbeard = findViewById(R.id.iv_beard)


        if(savedInstanceState!=null){
            IVhead?.setImageURI(savedInstanceState.getParcelable("imageUriHead"))
            imgUrihead = savedInstanceState.getParcelable("imageUriHead")
            IVhair?.setImageURI(savedInstanceState.getParcelable("imageUriHair"))
            imgUrihair = savedInstanceState.getParcelable("imageUriHair")
            IVmoustache1?.setImageURI(savedInstanceState.getParcelable("imageUriMoustache"))
            imgUrimoustache = savedInstanceState.getParcelable("imageUriMoustache")
            IVeyes?.setImageURI(savedInstanceState.getParcelable("imageUriEyes"))
            imgUrieyes = savedInstanceState.getParcelable("imageUriEyes")
            IVeyebrow?.setImageURI(savedInstanceState.getParcelable("imageUriEyebrow"))
            imgUrieyebrow = savedInstanceState.getParcelable("imageUriEyebrow")
            IVbeard?.setImageURI(savedInstanceState.getParcelable("imageUriBeard"))
            imgUribeard = savedInstanceState.getParcelable("imageUriBeard")
        }

        btn_head.setOnClickListener{
            iv_status = "Head"
            val imagePickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, imgCode)
        }

        btn_hair.setOnClickListener{
            iv_status = "Hair"
            val imagePickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, imgCode)
        }

        btn_moustache.setOnClickListener{
            iv_status = "Moustache"
            val imagePickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, imgCode)
        }

        btn_eyes.setOnClickListener{
            iv_status = "Eyes"
            val imagePickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, imgCode)
        }

        btn_eyebrow.setOnClickListener{
            iv_status = "Eyebrow"
            val imagePickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, imgCode)
        }

        btn_beard.setOnClickListener{
            iv_status = "Beard"
            val imagePickerIntent = Intent(Intent.ACTION_GET_CONTENT)
            imagePickerIntent.type = "image/*"
            startActivityForResult(imagePickerIntent, imgCode)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (iv_status=="Head"){
            imgUrihead = data?.data
            IVhead?.setImageURI(imgUrihead)
        } else if (iv_status == "Hair"){
            imgUrihair = data?.data
            IVhair?.setImageURI(imgUrihair)
        } else if (iv_status == "Moustache"){
            imgUrimoustache = data?.data
            IVmoustache1?.setImageURI(imgUrimoustache)
        } else if (iv_status == "Eyes"){
            imgUrieyes = data?.data
            IVeyes?.setImageURI(imgUrieyes)
        } else if (iv_status == "Eyebrow"){
            imgUrieyebrow = data?.data
            IVeyebrow?.setImageURI(imgUrieyebrow)
        } else if (iv_status == "Beard"){
            imgUribeard = data?.data
            IVbeard?.setImageURI(imgUribeard)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("imageUriHead", imgUrihead)
        outState.putParcelable("imageUriHair", imgUrihair)
        outState.putParcelable("imageUriMoustache", imgUrimoustache)
        outState.putParcelable("imageUriEyes", imgUrieyes)
        outState.putParcelable("imageUriEyebrow", imgUrieyebrow)
        outState.putParcelable("imageUriBeard", imgUribeard)
    }
}