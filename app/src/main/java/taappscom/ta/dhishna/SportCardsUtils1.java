package taappscom.ta.dhishna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Jugal on 29-08-2017.
 */

public class SportCardsUtils1 {
    public static Collection<SportCardModel> generateSportCards() {
        List<SportCardModel> sportCardModels = new ArrayList<>(1);

        {
            sportCardModels.add(SportCardModel
                    .newBuilder()
                    .withSportTitle("Table tennis")
                    .withSportSubtitle("Woman's singles")
                    .withSportRound("Preliminaries")
                    .withImageResId(R.drawable.comp)
                    .withTime("3:00")
                    .withDayPart("PM")
                    .withBackgroundColorResId(R.color.cardview_dark_background)
                    .build());

        }


        return sportCardModels;
    }
}


