package com.gpb;

import java.util.List;

/**
 * Created by wanjian on 2017/5/10.
 */

public class JsonData {
    public int tabType;
    public String mbook;
    public boolean isEnd;
    public List<Shop> list;


    public static class Shop {
        public String avatar;//": "http
        public String name;//": "颜料袋家xx
        public String uname;//": "袋子Bab
        public boolean isCollected;//":
        public int newNum;//": 2,
        public String sale;//": "销量:586
        public String recommendText;//"
        public String shopUrl;//": "mgj
        public String shopId;//": "14t9
        public String userId;//": "12rt
        public String icon;//": "",
        public List<Goods> goods;
        public int originOrder;
        public List<Campaign> shopCampaigns;
        public boolean collected;

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public void setCollected(boolean collected) {
            isCollected = collected;
        }

        public void setNewNum(int newNum) {
            this.newNum = newNum;
        }

        public void setSale(String sale) {
            this.sale = sale;
        }

        public void setRecommendText(String recommendText) {
            this.recommendText = recommendText;
        }

        public void setShopUrl(String shopUrl) {
            this.shopUrl = shopUrl;
        }

        public void setShopId(String shopId) {
            this.shopId = shopId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setGoods(List<Goods> goods) {
            this.goods = goods;
        }

        public void setOriginOrder(int originOrder) {
            this.originOrder = originOrder;
        }

        public void setShopCampaigns(List<Campaign> shopCampaigns) {
            this.shopCampaigns = shopCampaigns;
        }

        public String getAvatar() {
            return avatar;
        }

        public String getName() {
            return name;
        }

        public String getUname() {
            return uname;
        }

        public boolean isCollected() {
            return isCollected;
        }

        public int getNewNum() {
            return newNum;
        }

        public String getSale() {
            return sale;
        }

        public String getRecommendText() {
            return recommendText;
        }

        public String getShopUrl() {
            return shopUrl;
        }

        public String getShopId() {
            return shopId;
        }

        public String getUserId() {
            return userId;
        }

        public String getIcon() {
            return icon;
        }

        public List<Goods> getGoods() {
            return goods;
        }

        public int getOriginOrder() {
            return originOrder;
        }

        public List<Campaign> getShopCampaigns() {
            return shopCampaigns;
        }
    }

    public static class Goods {

        public String imgUrl;//": "http://
        public String goodId;//": "1k7lgi8
        public String originPrice;//": "46
        public String discountPrice;//": "
        public String goodUrl;//": "mgj://

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setGoodId(String goodId) {
            this.goodId = goodId;
        }

        public void setOriginPrice(String originPrice) {
            this.originPrice = originPrice;
        }

        public void setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
        }

        public void setGoodUrl(String goodUrl) {
            this.goodUrl = goodUrl;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public String getGoodId() {
            return goodId;
        }

        public String getOriginPrice() {
            return originPrice;
        }

        public String getDiscountPrice() {
            return discountPrice;
        }

        public String getGoodUrl() {
            return goodUrl;
        }
    }

    public static class Campaign {
        public String limitPrice;//": "99",
        public String cutPrice;//": "5",
        public String campaignDesc;//": "满99元立减5元"

        public void setLimitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
        }

        public void setCutPrice(String cutPrice) {
            this.cutPrice = cutPrice;
        }

        public void setCampaignDesc(String campaignDesc) {
            this.campaignDesc = campaignDesc;
        }

        public String getLimitPrice() {
            return limitPrice;
        }

        public String getCutPrice() {
            return cutPrice;
        }

        public String getCampaignDesc() {
            return campaignDesc;
        }
    }

    public void setTabType(int tabType) {
        this.tabType = tabType;
    }

    public void setMbook(String mbook) {
        this.mbook = mbook;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public void setList(List<Shop> list) {
        this.list = list;
    }

    public int getTabType() {
        return tabType;
    }

    public String getMbook() {
        return mbook;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public List<Shop> getList() {
        return list;
    }
}
