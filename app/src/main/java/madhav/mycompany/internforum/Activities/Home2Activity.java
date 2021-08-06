package madhav.mycompany.internforum.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import madhav.mycompany.internforum.R;

public class Home2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
    }

    public void h6Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H6Activity.class);
        startActivity(intent);
    }
    public void h7Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H7Activity.class);
        startActivity(intent);
    }
    public void h8Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H8Activity.class);
        startActivity(intent);
    }
    public void h9Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H9Activity.class);
        startActivity(intent);
    }
    public void h10Clicked(View view){
        Intent intent = new Intent(getApplicationContext(),H10Activity.class);
        startActivity(intent);
    }
    public void preBtnClicked(View view){
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
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