package com.example.traningmvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.traningmvp.R;
import com.example.traningmvp.util.Constant;

import static android.widget.Toast.LENGTH_LONG;

public class UpdateActivity extends AppCompatActivity {
    TextView tvUserId;
    EditText editTextFirstName, editTextLastName, editTextBirtDate, editTextPassword, editTextConfirmPassword, editTextPhone;
    String  putFirstName, putLastName, putBirtDate, putPassword, putConfirmPassword, putPhone;
    int putUserId;

    private int image;
    private int userId;
    private String firstName;
    private String lastName;
    private long birthDate;
    private String password;
    private String confirmPassword;
    private String phone;

    private String TAG = "UpdateActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        tvUserId = (TextView) findViewById(R.id.tvUserId);
        editTextFirstName =  (EditText) findViewById(R.id.editFirstName);
        editTextLastName = (EditText) findViewById(R.id.editLastName);
        editTextBirtDate = (EditText) findViewById(R.id.editBirtDate);
        editTextPassword = (EditText) findViewById(R.id.editPassword);
        editTextConfirmPassword = (EditText) findViewById(R.id.editConfirmPassword);
        editTextPhone = (EditText) findViewById(R.id.editPhone);

        userId = getIntent().getIntExtra(Constant.USER_ID, 123);
        firstName = getIntent().getStringExtra(Constant.FIRST_NAME);
        lastName = getIntent().getStringExtra(Constant.LAST_NAME);
        birthDate = getIntent().getLongExtra(Constant.BIRTH_DATE, 123);
        password = getIntent().getStringExtra(Constant.PASSWORD);
        confirmPassword = getIntent().getStringExtra(Constant.CONFIRM_PASSWORD);
        phone = getIntent().getStringExtra(Constant.PHONE);

        Log.e(TAG, "ID: " + userId );
        Log.e(TAG, "First Name: " + firstName );
        Log.e(TAG, "Birth Date: " + birthDate );

//        tvUserId.setText(putUserId);
//        editTextFirstName.setText(putFirstName);
//        editTextLastName.setText(putLastName);
//        editTextBirtDate.setText(putBirtDate);
//        editTextPassword.setText(putPassword);
//        editTextConfirmPassword.setText(putConfirmPassword);
//        editTextPhone.setText(putPhone);
    }

    public void buttonUpdate(View view) {
        Toast.makeText(getApplicationContext(), "Update User", LENGTH_LONG).show();
    }
}
