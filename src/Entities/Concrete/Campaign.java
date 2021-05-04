package Entities.Concrete;

import Entities.Entity;

public class Campaign implements Entity {
    private int campaignId;
    private String campaignName;

    public Campaign(int campaignId, String campaignName) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
