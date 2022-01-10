package com.kalash.superschurken;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class SuperSchurke implements Parcelable {
    private String[] mName;
    private String mAlias;
    private String mUniverse;
    private String[] mRole;
    private String[] mCapabilities;
    private String[] mHobby;
    private String mStatus;
    private int mImageResourceId;
    private String mWeitereInfosLink;
    private static final int NO_IMAGE_PROVIDED = -1;
    private static ArrayList<SuperSchurke> mSuperSchurken;

    public static final Creator<SuperSchurke> CREATOR = new SchurkenCreator();

    public SuperSchurke(String[] name,
                        String alias,
                        String universe,
                        String[] role,
                        String[] capabilities,
                        String[] hobby,
                        String status,
                        int imageResourceId,
                        String weitereInfosLink) {
        mName = name;
        mAlias = alias;
        mUniverse = universe;
        mRole = role;
        mCapabilities = capabilities;
        mHobby = hobby;
        mStatus = status;
        mImageResourceId = imageResourceId;
        mWeitereInfosLink = weitereInfosLink;
    }

    public SuperSchurke(Parcel in) {
        mName = in.createStringArray();
        mAlias = in.readString();
        mUniverse = in.readString();
        mRole = in.createStringArray();
        mCapabilities = in.createStringArray();
        mHobby = in.createStringArray();
        mStatus = in.readString();
        mImageResourceId = in.readInt();
        mWeitereInfosLink = in.readString();
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(mName);
        parcel.writeString(mAlias);
        parcel.writeString(mUniverse);
        parcel.writeStringArray(mRole);
        parcel.writeStringArray(mCapabilities);
        parcel.writeStringArray(mHobby);
        parcel.writeString(mStatus);
        parcel.writeInt(mImageResourceId);
        parcel.writeString(mWeitereInfosLink);
    }

    public String[] getName() { return mName; }

    public String getAlias() { return mAlias; }

    public String getUniverse() { return mUniverse; }

    public String[] getRole() { return mRole; }

    public String[] getCapabilities() { return mCapabilities; }

    public String[] getHobby() { return mHobby; }

    public String getStatus() { return mStatus; }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    public String getWeitereInfosLink() { return mWeitereInfosLink; }

    public synchronized static ArrayList<SuperSchurke> getSuberSchurken() {
        if (mSuperSchurken == null) {
            mSuperSchurken = new ArrayList<SuperSchurke>();

            mSuperSchurken.add(
                    new SuperSchurke(new String[]{ "Robert DuBois (ursprünglich)", "Alexander Trent (Nachfolger)" },
                    "Bloodsport", "DC Comics", new String[]{"Handlanger", "Luthors Massenmörder"},
                    new String[]{ "Herbeiteleportieren von Schusswaffen" }, new String[]{ "Superman töten" },
                    "Verstorben", R.drawable.bloodsport, "https://schurken.fandom.com/de/wiki/Bloodsport_(DC_Comics)")
            );

            mSuperSchurken.add(
                    new SuperSchurke(new String[]{ "Norman Osborn" }, "Der Kobold", "Spider-Man (2002)",
                    new String[]{"Wissenschaftler", "CEO von Oscorp"},
                    new String[]{ "Übermenschliche Stärke", "High-Tech-Kampfgleiter", "Gepanzerte Flugrüstung", "Kobold-Granaten" },
                    new String[]{ "Forschen" }, "Verstorben", R.drawable.kobold,
       "https://schurken.fandom.com/de/wiki/Gr%C3%BCner_Kobold_(Spider-Man-Filmtrilogie)")
            );

            mSuperSchurken.add(
                    new SuperSchurke(new String[]{ "Quentin Beck" }, "Mysterio", "Marvel Comics",
                    new String[] {"Techniker für Spezialeffekte Superschurke Illusionist"},
                    new String[]{ "Spezialeffekte", "Hypnose", "Illusionen" }, new String[]{ "Spezialeffekte kreieren" },
                    "Verstorben", R.drawable.mysterio, "https://schurken.fandom.com/de/wiki/Mysterio_(Marvel)")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Thomas Michael Shelby" }, "Tommy", "Peaky Blinders", new String[]{"Geschäftsmann", "Gangster", "Politiker"},
                    new String[]{ "Intelligenz auf Genie-Niveau", "Unternehmensführung", "Militärausbildung" },
                    new String[]{ "Trinken", "Drogen machen", "Frauen treffen" },
                    "Lebendig", R.drawable.thomas_shelby, "https://schurken.fandom.com/de/wiki/Thomas_Shelby")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Negan Smith" }, "Negan Smith", "The Walking Dead", new String[]{"Anführer der Saviors"},
                    new String[]{ "Lucille", "Feuerwaffen", "Charisma und Intelligenz", "Rohe Stärke" },
                    new String[]{ "Billiard spielen", "Psychospielchen spielen" },
                    "Inhaftiert", R.drawable.negan_hauptseite, "https://schurken.fandom.com/de/wiki/Negan_(The_Walking_Dead)")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Johann Schmidt" }, "Red Skull", "Marvel Cinematic Universe", new String[]{"HYDRA-Leiter", "Wissenschaftler", "Wächter des Seelensteins"},
                    new String[]{ "Übermenschliche Stärke und Reflexe", "Loyalität seiner HYDRA-Soldaten" },
                    new String[]{ "-" },
                    "Lebendig", R.drawable.red_skull_mcu, "https://schurken.fandom.com/de/wiki/Red_Skull_(Marvel_Cinematic_Universe)")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Maxwell Dillon" }, "Electro", "The Amazing Spider-Man 2", new String[]{"Techniker bei Oscorp", "Superschurke"},
                    new String[]{ "Elektrizität erschaffen", "Energieblitze erschaffen", "Strom und Energie absorbieren", "Sich selbst in reine Energie umwandeln", "Levitation" },
                    new String[]{ "-" },
                    "Verstorben", R.drawable.electro_asm, "https://schurken.fandom.com/de/wiki/Electro_(The_Amazing_Spider-Man)")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Lonnie Lincoln" }, "Tombstone", "Marvel's Spider-Man (2018)", new String[]{"Biker", "Gang-Anführer", "Drogendealer"},
                    new String[]{ "Unsterblichkeit", "Undurchdringliche Haut", "SRohe Stärke", "SHandlanger" },
                    new String[]{ "An Bikes rumbasteln" },
                    "Inhaftiert", R.drawable.tombstone, "https://schurken.fandom.com/de/wiki/Tombstone_(Marvel%27s_Spider-Man)")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Abner Krill" }, "Polka Dot Man", "DC Comics", new String[]{"-"},
                    new String[]{ "-" }, new String[]{ "-" },
                    "Verstorben", R.drawable.polka_dot_man, "https://schurken.fandom.com/de/wiki/Polka_Dot_Man_(DC_Comics)")
            );

            mSuperSchurken.add(new SuperSchurke(
                    new String[]{ "Barbara Ann Minerva" }, "Cheetah", "DC Comics", new String[]{"Archäologin (vormals)", "Superschurkin"},
                    new String[]{ "Extreme Stärke und Geschwindigkeit", "Ferale Instinkte", "Scharfe Klauen und Zähne", "Genialer Verstand" }, new String[]{ "-" },
                    "-", R.drawable.cheetah, "https://schurken.fandom.com/de/wiki/Cheetah_(DC_Comics)")
            );
        }

        return mSuperSchurken;
    }
}
