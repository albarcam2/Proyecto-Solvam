package com.example.hontex.geekhubapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alberto on 22/04/2016.
 */
public class ListAdaptor extends BaseAdapter {

    Activity act;
    Integer animals[] = new Integer[]{
            R.drawable.avestruz, R.drawable.elefante,
            R.drawable.lion, R.drawable.pantera,
            R.drawable.pig

    };
    String text[] = new String[]{
            "Avestruz ", "Elefante", "León", "Pantera", "Cerdo"

    };

    String desc[] = new String[]{
            "El avestruz (Struthio camelus) es una especie de ave estrutioniforme de la familia Struthionidae. Es un ave grande que no vuela, sino que es corredora. Se halla en África, y en tiempos pasados también habitó en Oriente Medio. Es la más grande y la más pesada de las aves que aún existen; puede alcanzar los 3 metros de altura y pesar unos 180 kg.",
            "Los elefantes o elefántidos (Elephantidae) son una familia de mamíferos placentarios del orden Proboscidea. Antiguamente se clasificaban, junto con otros mamíferos de piel gruesa, en el orden, ahora inválido, de los paquidermos (Pachydermata). Existen hoy en día tres especies y diversas subespecies. Entre los géneros extintos de esta familia destacan los mamuts.",
            "El león (Panthera leo) es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera. Los leones salvajes viven en África subsahariana y Asia, con una población en peligro crítico al noroeste de la India, habiendo desaparecido del norte de África, de Oriente Próximo y del oeste de Asia en tiempos históricos. Hasta finales del Pleistoceno, hace aproximadamente 10 000 años, de los grandes mamíferos terrestres, el león era el más extendido tras los humanos. Su distribución cubría la mayor parte de África, gran parte de Eurasia, desde el oeste de Europa hasta la India, y en América, desde el río Yukón hasta el sur de México.",
            "La pantera negra es una variación negra (melanismo) de varias especies de grandes félidos, en especial del leopardo (Panthera pardus) y del jaguar (Panthera onca).",
            "El cerdo (Sus scrofa domestica) es una subespecie de mamífero artiodáctilo de la familia Suidae. Es un animal doméstico usado en la alimentación humana por muchos pueblos. Su nombre científico es Sus scrofa ssp. domestica, aunque algunos autores lo denominan Sus domesticus o Sus domestica, reservando Sus scrofa para el jabalí. Su domesticación se inició en el Próximo Oriente hace unos 13 000 años, aunque se produjo un proceso paralelo e independiente de domesticación en China."
    };

    public ListAdaptor(Activity activity) {
        act = activity;
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return animals[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = act.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_listadaptor, null);
        TextView tv = (TextView) v.findViewById(R.id.tv1);
        ImageView img = (ImageView) v.findViewById(R.id.img1);


        tv.setText(text[position]);
        img.setImageResource(animals[position]);

        return v;
    }

}