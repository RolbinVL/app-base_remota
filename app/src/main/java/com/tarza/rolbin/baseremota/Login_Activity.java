package com.tarza.rolbin.baseremota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.json.JSONArray;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Login_Activity extends AppCompatActivity {

    Button btnIngrsar;

    TextView txtusu = (TextView) findViewById(R.id.txt_Cor);
    TextView txtpas = (TextView) findViewById(R.id.txt_pas);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        btnIngrsar=(Button)findViewById(R.id.btn_Ingresar);

        /*btnIngrsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread tr =new Thread(){
                    @Override
                    public void run() {
                        String res=null;
                        try {
                            res = enviarPOst(txtusu.getText().toString(),txtpas.getText().toString());
                        } catch (IOException e) {}
                        final String finalRes = res;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int r=objJSON(finalRes);
                                if (r>0){
                                    Intent i =new Intent(getApplicationContext(),Principal_Activity.class);
                                    startActivity(i);
                                }

                            }
                        });

                    }
                };

                tr.start();

            }
        });*/


    }
    /*public  String enviarPOst(String cor,String pas) throws IOException {
        String parametros="cor"+txtusu+"&pas"+txtpas;
        HttpURLConnection connection=null;
        String respuesta="";
        try{
            URL url=new URL("http://192.168.0.107/WebService/valida.php");
            connection=(HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Length",""+Integer.toString(parametros.getBytes().length));
            connection.setDoOutput(true);
            DataOutputStream wr= new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(parametros);
            wr.close();

            Scanner inStream=new Scanner(connection.getInputStream());
            while (inStream.hasNextLine())
                respuesta+=(inStream.nextLine());


        }catch (Exception e) {}

        return respuesta.toString();

    }

    public int objJSON(String rspta){
        int res=0;
        try {
            JSONArray json=new JSONArray(rspta);
            if (json.length()>0)
                res=1;

        }catch (Exception e){}
        return res;

    }*/



}
