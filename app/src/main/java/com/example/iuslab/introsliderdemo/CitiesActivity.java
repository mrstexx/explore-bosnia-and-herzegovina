package com.example.iuslab.introsliderdemo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CitiesActivity extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ImageView sarajevo;
        ImageView banjaluka;
        ImageView mostar;
        ImageView bihac;
        ImageView trebinje;
        ImageView zenica;

        View v = inflater.inflate(R.layout.activity_cities, container, false);

        sarajevo = (ImageView) v.findViewById(R.id.sarajevo_id);
        sarajevo.setOnClickListener(this);

        banjaluka = (ImageView) v.findViewById(R.id.banjaluka_id);
        banjaluka.setOnClickListener(this);

        mostar = (ImageView) v.findViewById(R.id.mostar_id);
        mostar.setOnClickListener(this);

        bihac = (ImageView) v.findViewById(R.id.bihac_id);
        bihac.setOnClickListener(this);

        trebinje = (ImageView) v.findViewById(R.id.trebinje_id);
        trebinje.setOnClickListener(this);

        zenica = (ImageView) v.findViewById(R.id.zenica_id);
        zenica.setOnClickListener(this);

        return v;
    }

    private void start_sarajevo() {
        getActivity().startActivity(new Intent(getActivity(), SarajevoActivity.class));
    }

    private void start_banjaluka() {
        getActivity().startActivity(new Intent(getActivity(), BanjalukaActivity.class));
    }

    private void start_mostar() {
        getActivity().startActivity(new Intent(getActivity(), MostarActivity.class));
    }

    private void start_bihac() {
        getActivity().startActivity(new Intent(getActivity(), BihacActivity.class));
    }

    private void start_trebinje() {
        getActivity().startActivity(new Intent(getActivity(), TrebinjeActivity.class));
    }

    private void start_zenica() {
        getActivity().startActivity(new Intent(getActivity(), ZenicaActivity.class));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sarajevo_id:
                start_sarajevo();
                break;
            case R.id.banjaluka_id:
                start_banjaluka();
                break;
            case R.id.mostar_id:
                start_mostar();
                break;
            case R.id.bihac_id:
                start_bihac();
                break;
            case R.id.trebinje_id:
                start_trebinje();
                break;
            case R.id.zenica_id:
                start_zenica();
                break;
        }
    }
}
