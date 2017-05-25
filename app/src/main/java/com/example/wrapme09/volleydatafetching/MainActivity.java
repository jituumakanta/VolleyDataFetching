package com.example.wrapme09.volleydatafetching;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getofferNews();
    }


    private JsonObjectRequest getofferNews() {

        String url = "http://quliver.com/wrapme/get_productname.php";
        final JsonObjectRequest jsObjRequest5 = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {

                System.out.println(response);
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        MySingleton.getInstance(this).addToRequestQueue(jsObjRequest5);
        return jsObjRequest5;

    }




   /* public void praseJsonNewsData9(JSONObject o) {

        JSONObject jj = o;
        JSONArray rr;
        JSONObject object;


        try {
            // converting object to array
            rr = jj.getJSONArray("ProductDetails");

            for (int i = 0; i < rr.length(); i++) {
                SingleItemObjectDetails = new SingleItemModel();

                object = rr.getJSONObject(i);

                String productname = object.getString("ProductName");
                String ProductPrice = object.getString("ProductPrice");


                SingleItemObjectDetails.setProductName(productname);
                SingleItemObjectDetails.setProductPrice(ProductPrice);

                System.out.println(productname + "  " + ProductPrice);
                singleItem.add(SingleItemObjectDetails);
                System.out.println("ccccccccc" + singleItem);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }*/


}
