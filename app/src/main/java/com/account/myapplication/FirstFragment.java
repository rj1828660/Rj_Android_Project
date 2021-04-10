package com.account.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {
 EditText editText;
 Button button;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        button = view.findViewById(R.id.button1);
        editText = view.findViewById(R.id.editTextTextPersonName);

       // Intent intent;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //Implict Intent to Open web Brwoser:
//            public void onClick(View v) {
//                String string=editText.getText().toString();
//                Toast.makeText(getActivity(),string,Toast.LENGTH_SHORT).show();
//               // String url = "http://www.google.com";
//                Uri uri = Uri.parse(string);
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                // Verify that the intent will resolve to an activity
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
//                    // Here we use an intent without a Chooser unlike the next example
//                    startActivity(intent);
//                }
//
//            }
//        });
//
                    //**********

                    //Implict Intent to Open Email sending app:
//            public void onClick(View v) {
//                String[] addresses = {"raj1828660", "raj.kumar.etc"};
//
//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//               // intent.setType("*/*");
//                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
//                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
//                intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
//              //  intent.putExtra(Intent.EXTRA_STREAM, attachment);
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
//                    startActivity(intent);
//                }
//
//            }
//
//        });

            //Implict intent for Alarm app :

                        public void onClick(View v) {
              //  String[] addresses = {"raj1828660", "raj.kumar.etc"};

               int minutes=45  ,hour=2;
               // intent.setType("*/*");
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, "Set Alarm")
                        .putExtra(AlarmClock.EXTRA_HOUR, hour)
                        .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);


                }

            }

        });
    }
}