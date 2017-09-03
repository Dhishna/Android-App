package taappscom.ta.dhishna;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SportCardsUtils {

    private String contact;
    private ArrayList<String> contacts;
    private String description;
    private String details;
    private String eventformat;
    private String eventid;
    private String image;
    private String name;
    private String pricepool;
    private String Branch;
    private ArrayList<String> rules;
    private String websitelink;

    public ArrayList<String> getContacts()

    {
        return this.contacts;
    }

    public void setContacts(ArrayList<String> contacts)
    {
        this.contacts = contacts;
    }

    public String getEventid() {
        return this.eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public String getWebsitelink() {
        return this.websitelink;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return this.contact;
    }

    public void setWebsitelink(String websitelink) {
        this.websitelink = websitelink;
    }

    public String getEventformat() {
        return this.eventformat;
    }

    public void setEventformat(String eventformat) {
        this.eventformat = eventformat;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getBranch()
    {
        return this.Branch;
    }
    public void setBranch(String Branch)
    {
        this.Branch=Branch;
    }

    public String getPricepool() {
        return this.pricepool;
    }

    public void setPricepool(String pricepool) {
        this.pricepool = pricepool;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getRules() {
        return this.rules;
    }

    public void setRules(ArrayList<String> rules) {
        this.rules = rules;
    }
    public static Collection<SportCardModel> generateSportCards(List<SportCardsUtils> events) {
        List<SportCardModel> sportCardModels = new ArrayList<>(events.size());
        {
for (int i=0;i<events.size();i++) {
    sportCardModels.add(SportCardModel.newBuilder().withSportTitle(events.get(i).name).withSportSubtitle(events.get(i).description)
            .withSportRound(events.get(i).details+"\n"+events.get(i).pricepool+"\n"+events.get(i).rules+"\n"+events.get(i).contact)
            .withImageResId(R.drawable.comp)
            .withTime("3:00")
            .withDayPart("PM")
            .withBackgroundColorResId(R.color.cardview_dark_background).build());
}
        }return  sportCardModels;}

}
