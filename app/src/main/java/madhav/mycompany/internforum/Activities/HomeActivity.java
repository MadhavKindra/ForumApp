package madhav.mycompany.internforum.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import madhav.mycompany.internforum.R;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




    }

    public void h1Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H1Activity.class);
        startActivity(intent);
    }
    public void h2Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H2Activity.class);
        startActivity(intent);
    }
    public void h3Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H3Activity.class);
        startActivity(intent);
    }
    public void h4Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H4Activity.class);
        startActivity(intent);
    }
    public void h5Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H5Activity.class);
        startActivity(intent);
    }
    public void nextBtnClicked(View view){
        Intent intent = new Intent(getApplicationContext(),Home2Activity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.options_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId() == R.id.home){
            Intent intent = new Intent(getApplicationContext(),HomeActivity.class);

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            return true;
        }
        else if (item.getItemId() == R.id.log_out){


            Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
            FirebaseAuth.getInstance().signOut();
            Toast.makeText(getApplicationContext(),"Signed Out", Toast.LENGTH_LONG).show();

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            return true;
        }
        return false;
    }


}