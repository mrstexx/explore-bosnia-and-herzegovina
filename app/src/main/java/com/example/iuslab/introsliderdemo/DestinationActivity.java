package com.example.iuslab.introsliderdemo;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

public class DestinationActivity extends Fragment {
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_destination, container, false);

        // bascarsija

        ImageView bascarsija = (ImageView) rootView.findViewById(R.id.map_bascarsija);

        bascarsija.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.859961, 18.431155);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // vrelo bosne

        ImageView vrelo = (ImageView) rootView.findViewById(R.id.map_vrelo);

        vrelo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.818844, 18.269447);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // mostar

        ImageView mostar = (ImageView) rootView.findViewById(R.id.map_most);

        mostar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.337254, 17.814929);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // doboj

        ImageView doboj = (ImageView) rootView.findViewById(R.id.map_gradina);

        doboj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.614478, 17.989061);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // neum

        ImageView neum = (ImageView) rootView.findViewById(R.id.map_neum);

        neum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 42.920512, 17.617178);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // prolosko

        ImageView prolosko = (ImageView) rootView.findViewById(R.id.map_prolosko);

        prolosko.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.463071, 17.100940);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // krvavice

        ImageView krvavice = (ImageView) rootView.findViewById(R.id.map_krvavice);

        krvavice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.156141, 17.608030);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // jahorina

        ImageView jahorina = (ImageView) rootView.findViewById(R.id.map_jahorina);

        jahorina.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.738523, 18.563650);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // bjelasnica

        ImageView bjelasnica = (ImageView) rootView.findViewById(R.id.map_bi);

        bjelasnica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.704104, 18.256710);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // travnik

        ImageView travnik = (ImageView) rootView.findViewById(R.id.map_travnik);

        travnik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.229908, 17.670802);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // medjugorje

        ImageView medjugorje = (ImageView) rootView.findViewById(R.id.map_medjugorje);

        medjugorje.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.188638, 17.673279);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // una

        ImageView una = (ImageView) rootView.findViewById(R.id.map_una);

        una.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.491823, 16.139617);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // pliva

        ImageView pliva = (ImageView) rootView.findViewById(R.id.map_jezero);

        pliva.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.347217, 17.221186);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // pliva

        ImageView kastel = (ImageView) rootView.findViewById(R.id.map_kastel);

        kastel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.766225, 17.190553);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // stanisic

        ImageView stanisic = (ImageView) rootView.findViewById(R.id.map_stanisic);

        stanisic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.784568, 19.278474);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // jajce

        ImageView jajce = (ImageView) rootView.findViewById(R.id.map_jajce);

        jajce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.337866, 17.270374);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // izvor plive

        ImageView izvorPlive = (ImageView) rootView.findViewById(R.id.map_pliva);

        izvorPlive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 44.239384, 17.024096);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });

        // hutovo blato

        ImageView hutovoBlato = (ImageView) rootView.findViewById(R.id.map_hutovo);

        hutovoBlato.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.061639, 17.784657);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getActivity().startActivity(intent);
            }
        });


        return rootView;
    }
}
