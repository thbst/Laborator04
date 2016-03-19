package ro.pub.cs.systems.eim.lab03.phonedialer.general;

import ro.pub.cs.systems.eim.lab03.phonedialer.R;

public interface Constants {
    final public static int[] buttonIds = {
            R.id.number_0_button,
            R.id.number_1_button,
            R.id.number_2_button,
            R.id.number_3_button,
            R.id.number_3_button,
            R.id.number_4_button,
            R.id.number_5_button,
            R.id.number_6_button,
            R.id.number_7_button,
            R.id.number_8_button,
            R.id.number_9_button
    };
    
    final public static String CONTACTS_MANGER_ACTIVITY = "ro.pub.cs.systems.eim.lab04.contactsmanager.intent.action.ContactsManagerActivity";
    final public static int CONTACTS_MANAGER_REQUEST_CODE = 1;
    final public static String PHONE_NUMBER_KEY = "ro.pub.cs.systems.eim.lab04.contactsmanager.PHONE_NUMBER_KEY";
}
