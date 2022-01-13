package com.example.cw2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Picasso;

public class PhotoActivity extends AppCompatActivity {

    //Pick image request
    private static final int PICK_IMAGE_REQUEST = 1;

    private Button mBtnChoosePhoto;
    private Button mBtnTakePhoto;
    private EditText mTextFileName;
    private ImageView mPhotoView;
    private ProgressBar mProgressBar;
    private Button mBtnUpload;
    private Button mBtnShowUpload;

    private Uri mImageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        mBtnChoosePhoto = findViewById(R.id.btnChoosePhoto);
        mBtnTakePhoto = findViewById(R.id.btnTakePhoto);
        mTextFileName = findViewById(R.id.textFileName);
        mPhotoView = findViewById(R.id.photoView);
        mProgressBar = findViewById(R.id.progressBar);
        mBtnUpload = findViewById(R.id.btnUpload);
        mBtnShowUpload = findViewById(R.id.btnShowUpload);

        mBtnChoosePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toFileChooser();
            }
        });

        mBtnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mBtnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mBtnShowUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    //btnChoosePhoto function (image)
    private void toFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    //Picasso
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null) {
            mImageUri = data.getData();

            Picasso.get().load(mImageUri).into(mPhotoView);


        }
    }
}