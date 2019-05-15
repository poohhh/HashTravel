package edu.android.hashtravel;

import java.util.ArrayList;
import java.util.List;
import static edu.android.hashtravel.DashBoard.Place;

public class PlaceDao {
    // 여행지 리스트
    private List<Place> placeList = new ArrayList<>();

    // Singleton 디자인 패턴
    private static PlaceDao instance = null;
    private PlaceDao() {
        makeDummyData();
    }

    private void makeDummyData() {
        placeList.add(new Place("개선문", null, 3.5F, R.drawable.arc_de_triomphe));
        placeList.add(new Place("에펠탑", null, 4.0F, R.drawable.eiffel_tower));
        placeList.add(new Place("금문교", null, 3.0F, R.drawable.golden_gate_bridge));
        placeList.add(new Place("국회의사당", null, 3.5F, R.drawable.house_of_parliament));
        placeList.add(new Place("런던아이", null, 5.0F, R.drawable.london_eye));
        placeList.add(new Place("타워브리지", null, 4.5F, R.drawable.tower_bridge));
    }

    public static PlaceDao getInstance() {
        if(instance == null) {
            instance = new PlaceDao();
        }
        return instance;
    }

    public List<Place> getPlaceList() {
        return placeList;
    }
}
