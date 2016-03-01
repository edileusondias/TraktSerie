package com.edileusondias.traktseries;

import com.edileusondias.traktseries.model.Images;
import com.edileusondias.traktseries.model.Poster;
import com.edileusondias.traktseries.model.Series;

import junit.framework.TestCase;

/**
 * Created by Eddy on 3/1/2016.
 */
public class MainActivityTest extends TestCase {

    public void testConverterJson() throws Exception {
        String json = "[\n" +
                "  {\n" +
                "    \"title\": \"Game of Thrones\",\n" +
                "    \"year\": 2011,\n" +
                "    \"ids\": {\n" +
                "      \"trakt\": 1390,\n" +
                "      \"slug\": \"game-of-thrones\",\n" +
                "      \"tvdb\": 121361,\n" +
                "      \"imdb\": \"tt0944947\",\n" +
                "      \"tmdb\": 1399,\n" +
                "      \"tvrage\": 24493\n" +
                "    },\n" +
                "    \"images\": {\n" +
                "      \"fanart\": {\n" +
                "        \"full\": \"https://walter.trakt.us/images/shows/000/001/390/fanarts/original/76d5df8aed.jpg\",\n" +
                "        \"medium\": \"https://walter.trakt.us/images/shows/000/001/390/fanarts/medium/76d5df8aed.jpg\",\n" +
                "        \"thumb\": \"https://walter.trakt.us/images/shows/000/001/390/fanarts/thumb/76d5df8aed.jpg\"\n" +
                "      },\n" +
                "      \"poster\": {\n" +
                "        \"full\": \"https://walter.trakt.us/images/shows/000/001/390/posters/original/93df9cd612.jpg\",\n" +
                "        \"medium\": \"https://walter.trakt.us/images/shows/000/001/390/posters/medium/93df9cd612.jpg\",\n" +
                "        \"thumb\": \"https://walter.trakt.us/images/shows/000/001/390/posters/thumb/93df9cd612.jpg\"\n" +
                "      },\n" +
                "      \"logo\": {\n" +
                "        \"full\": \"https://walter.trakt.us/images/shows/000/001/390/logos/original/13b614ad43.png\"\n" +
                "      },\n" +
                "      \"clearart\": {\n" +
                "        \"full\": \"https://walter.trakt.us/images/shows/000/001/390/cleararts/original/5cbde9e647.png\"\n" +
                "      },\n" +
                "      \"banner\": {\n" +
                "        \"full\": \"https://walter.trakt.us/images/shows/000/001/390/banners/original/9fefff703d.jpg\"\n" +
                "      },\n" +
                "      \"thumb\": {\n" +
                "        \"full\": \"https://walter.trakt.us/images/shows/000/001/390/thumbs/original/7beccbd5a1.jpg\"\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "]";
    MainActivity mainActivity = new MainActivity();
        Series[] serie,testserie = new Series[0];
        serie = mainActivity.converterJson(json);
        testserie[0] = new Series("Gameof Thrones",2011,new Images(new Poster("https://walter.trakt.us/images/shows/000/001/390/fanarts/thumb/76d5df8aed.jpg")));
        assertEquals(testserie,serie);
    }
}