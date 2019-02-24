package com.example.shahi.electrobekia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home_register extends AppCompatActivity implements View.OnClickListener{


    private EditText inputFName, inputEmail, inputPassword;
    private Button btnRegister, btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_register);
        getSupportActionBar().setTitle("Register");

        //Get Firebase auth instance

        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        inputFName = (EditText) findViewById(R.id.firstN);
        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        btnSignIn.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }
       /** btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fristN = inputFName.getText().toString().trim();
                String email = inputEmail.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                if (TextUtils.isEmpty(fristN)) {
                    Toast.makeText(getApplicationContext(), "Enter First name!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if {
                    Intent rt = new Intent(Register.this, Home.class);
                    startActivity(rt);
                }**/
/**}
 //create user
 auth.createUserWithEmailAndPassword(email, password)
 .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
@Override
public void onComplete(@NonNull Task<AuthResult> task) {

// If sign in fails, display a message to the user. If sign in succeeds
// the auth state listener will be notified and logic to handle the
// signed in user can be handled in the listener.
if (!task.isSuccessful()) {
Toast.makeText(getApplicationContext(), "Fail Register", Toast.LENGTH_SHORT).show();
Log.e("Login Failed",task.getException()+"");                                }
else {
database = FirebaseDatabase.getInstance();
myRef = database.getInstance().getReference().child("users").child(auth.getCurrentUser().getUid());
HashMap<String, Object> childUpdates = new HashMap<>();
childUpdates.put("email", inputEmail.getText().toString());
childUpdates.put("fristN", inputFName.getText().toString());
myRef.updateChildren(childUpdates);
Intent rt = new Intent(Register.this, Home.class);
startActivity(rt);                                }
}
});
 }
 });
 }



            }

        });
    } **/

    public void onClick(View w) {
        switch (w.getId()) {
            case R.id.btnRegister:
                Intent rr = new Intent(Home_register.this, Rep_Clify_op.class);
                startActivity(rr);
                break;
            case R.id.btnSignIn:
                Intent llo = new Intent(Home_register.this, Login.class);
                startActivity(llo);
                break;
        }
    }
}

