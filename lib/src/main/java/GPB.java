import com.google.gson.Gson;
import com.gpb.JsonData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by wanjian on 2017/5/10.
 */

public class GPB {


    public static void main(String[] args) throws Exception {
//        for (int i = 0; i < 10; i++) {
        run();
//        }
    }

    private static void run() throws Exception {

        JsonData jsonData = get();//获取 数据对象

        long s = System.currentTimeMillis();
        /*初始化Google Proto Buf 数据对象 并转换成byte数组*/
        ShopsData.ShopData.Builder builder = ShopsData.ShopData.newBuilder();
        builder.setTabType(jsonData.tabType);
        builder.setMbook(jsonData.mbook);
        builder.setIsEnd(jsonData.isEnd);

        for (JsonData.Shop shop : jsonData.getList()) {
            ShopsData.Shop.Builder shopBuilder = ShopsData.Shop.newBuilder();
            shopBuilder.setAvatar(shop.avatar);
            shopBuilder.setName(shop.name);
            shopBuilder.setUname(shop.uname);
            shopBuilder.setIsCollected(shop.isCollected);
            shopBuilder.setNewNum(shop.newNum);
            shopBuilder.setSale(shop.sale);
//            shopBuilder.setRecommendText(shop.recommendText);
            shopBuilder.setShopUrl(shop.shopUrl);
            shopBuilder.setShopId(shop.shopId);
            shopBuilder.setUserId(shop.userId);
            shopBuilder.setIcon(shop.icon);
            shopBuilder.setOriginOrder(shop.originOrder);
            shopBuilder.setCollected(shop.collected);

            for (JsonData.Goods good : shop.goods) {
                ShopsData.Goods.Builder goodsBuilder = ShopsData.Goods.newBuilder();
                goodsBuilder.setImgUrl(good.imgUrl);
                goodsBuilder.setGoodId(good.goodId);
                goodsBuilder.setOriginPrice(good.originPrice);
                goodsBuilder.setDiscountPrice(good.discountPrice);
                goodsBuilder.setGoodUrl(good.goodUrl);
                shopBuilder.addGoods(goodsBuilder.build());
            }

            for (JsonData.Campaign campaign : shop.shopCampaigns) {
                ShopsData.Campaign.Builder campBuilder = ShopsData.Campaign.newBuilder();
                campBuilder.setLimitPrice(campaign.limitPrice);
                campBuilder.setCutPrice(campaign.cutPrice);
                campBuilder.setCampaignDesc(campaign.campaignDesc);
                shopBuilder.addShopCampaigns(campBuilder.build());
            }
            builder.addList(shopBuilder.build());

        }

        ShopsData.ShopData shopData = builder.build();
//        System.out.println(shopData);
        s = System.currentTimeMillis();
        byte[] data = shopData.toByteArray();
        /*数据对象转换成byte数组结束*/
        long e = System.currentTimeMillis();
        System.out.println("GPB to json finished : " + (e - s));


        s = System.currentTimeMillis();
        /*bytes数据转换成google proto buf 数据对象*/
        shopData = ShopsData.ShopData.parseFrom(data);
        e = System.currentTimeMillis();
        System.out.println("GPB to obj finished : " + (e - s));

        System.out.println("GPB size (bytes) : " + data.length);
        System.out.println("\n\n<---------   obj -> byte[] -> GPB obj   ---------> \n\n");
//        System.out.println(shopData);

    }

    private static JsonData get() throws Exception {
        File josnFile = new File("lib/src/main/java/data.json");
        BufferedReader reader = new BufferedReader(new FileReader(josnFile));

        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        reader.close();
        System.out.println("------------BEGIN-----------");
        String json = builder.toString();
        System.out.println(json);
        System.out.println("------------END-----------");
        JsonData jsonData = null;
        long s = System.currentTimeMillis();
        jsonData = new Gson().fromJson(json, JsonData.class);

        return jsonData;
    }
}
