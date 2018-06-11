package edu.phoenix.mbl404.mbl404_group_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contacts {
    public static List<RolodexLoader> rolodexList;
    public static Map<String, RolodexLoader> rolodexMap;

    static {
        rolodexList = new ArrayList<>();
        rolodexMap = new HashMap<>();

        addItem(new RolodexLoader("OptumCare Medical Group"
                , "29873 Santa Margarita PKWY,\nRancho Santa Margarita, CA 92688"
                , "OPEN"
                , "http://www.optumcare.com"
                , 9497090988L
        ));

        addItem(new RolodexLoader("Oso Niguel Healthcare Center"
                , "27231 La Paz Rd,\nLaguna Niguel, CA 92677"
                , "OPEN"
                , "http://www.missionheritage.com"
                , 9496439111L
        ));

        addItem(new RolodexLoader("Marque Urgent Care"
                , "22461 Antonio Pkwy #135,\nRancho Santa Margarita, CA 92688"
                , "OPEN"
                , "http://www.marquemedical.com"
                , 8776936266L
        ));

        addItem(new RolodexLoader("SOS and PEACE Center Health Clinic"
                , "1 Purpose Dr,\nLake Forest, CA 92630"
                , "CLOSED"
                , "http://www.shareourselves.org"
                , 9496098199L
        ));

        addItem(new RolodexLoader("MinuteClinic"
                , "25272 Marguerite Pkwy,\nMission Viejo, CA 92692"
                , "OPEN"
                , "http://www.cvs.com"
                , 9495819120L
        ));

    }

    public static void addItem(RolodexLoader item) {
        rolodexList.add(item);
        rolodexMap.put(item.getContact(), item);
    }

    public static void removeItem(RolodexLoader item) {
        //trying to figure out how to remove items
        rolodexList.remove(item);
    }


}