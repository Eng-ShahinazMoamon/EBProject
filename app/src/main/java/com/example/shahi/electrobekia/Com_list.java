package com.example.shahi.electrobekia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Com_list extends AppCompatActivity {
 int IMAGE []={R.drawable.comi , R.drawable.comii , R.drawable.comiii ,
         R.drawable.mouse , R.drawable.kb , R.drawable.mb};
    String NAME[]={"Board 3" ,"Processor Pentium 3" , "Board 4" , "Mouse" ,"Keyboard" , "Mother Board"};
    String PRICE []={"price: 5 EGP","price: 7 EGP" , "price: 10 EGP" , "price: 4 EGP","price: 12 EGP","price: 15 EGP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com_list);
        getSupportActionBar().setTitle("Computer Components");
        ListView listView=(ListView)findViewById(R.id.comlist1);
        ComAdapter comadapter=new ComAdapter();
        listView.setAdapter(comadapter);
    }
    class ComAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGE.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.com_adapter,null);
            ImageView image=(ImageView)view.findViewById(R.id.comimage);
            TextView textname=(TextView)view.findViewById(R.id.textname);
            TextView textprice=(TextView)view.findViewById(R.id.textPrice);
            image.setImageResource(IMAGE[i]);
            textname.setText(NAME[i]);
            textprice.setText(PRICE[i]);

            return view;
        }
    }

    }

