package com.mruelas.kiik.view.ui.walktrough;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.mruelas.kiik.R;


public class SliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Slide[] slides = {
            new Slide(R.drawable.charity, "Registrate", "Unete a la red de donadores voluntarios."),
            new Slide(R.drawable.blood_transfusion, "Dona", "Ayuda a quien lo necesite."),
            new Slide(R.drawable.volunteer, "Busca", "Encuentra voluntarios cerca de ti!")
    };


    SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return slides.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = view.findViewById(R.id.iv_header);
        TextView slideTitle = view.findViewById(R.id.tv_title);
        TextView slideText = view.findViewById(R.id.tv_text);

        slideImageView.setImageResource(slides[position].image);
        slideTitle.setText(slides[position].title);
        slideText.setText(slides[position].text);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
