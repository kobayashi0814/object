package ex.inventory;

import java.util.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> pcList = new ArrayList<>();
            pcList.addAll(Arrays.asList(
                    new PersonalComputer("やまだ",1,1,40000,Constants.BIT_64, Constants.WINDOWS_10),
                    new PersonalComputer("いけだ",2,1,90000,Constants.BIT_64, Constants.WINDOWS_11),
                    new PersonalComputer("いのうえ",3,1,80000, Constants.BIT_64, Constants.WINDOWS_11),
                    new PersonalComputer("たむら",4,2,120000, Constants.BIT_32, Constants.MAC),
                    new PersonalComputer("わだ",5,2,30000, Constants.BIT_32, Constants.WINDOWS_10),
                    new PersonalComputer("くどう",6,2,150000, Constants.BIT_64, Constants.MAC),
                    new PersonalComputer("さらど",7,3,40000, Constants.BIT_32, Constants.WINDOWS_10),
                    new PersonalComputer("あいざわ",8,3,700000, Constants.BIT_32, Constants.MAC)
                    ));

        //保管倉庫ごとの在庫金額を抽出したいのでマップにする
        //Key:storageNo , Value:Price
        Map<Integer, ArrayList<Integer>> storagePriceMap = new HashMap<>();

            for(PersonalComputer p : pcList) {
                int storageNo = p.getStorageNo();
                if(!storagePriceMap.containsKey(storageNo)) {
                    storagePriceMap.put(storageNo, new ArrayList<>());
                }
                storagePriceMap.get(storageNo).add(p.getPcPrice());
            }

            //中身の表示
            System.out.println("マップの中身表示");
            for(Map.Entry entry : storagePriceMap.entrySet()) {
                System.out.println(entry.getKey() + ":");
                System.out.println(entry.getValue());
            }

        //保管倉庫ごとのOSを抽出してマップにする
        //osMapの初期化
        //key : storageNo
        //value : OS
        Map<Integer, ArrayList<String>> osMap = new HashMap<>();

            for(PersonalComputer p : pcList) {
                int storageNo = p.getStorageNo();
                if(!osMap.containsKey(storageNo)) {
                    osMap.put(storageNo, new ArrayList<>());
                }
                osMap.get(storageNo).add(p.getOS());
            }

            //中身の表示
            System.out.println("マップの中身表示");
            for(Map.Entry entry : osMap.entrySet()) {
                System.out.println(entry.getKey() + ":");
                System.out.println(entry.getValue());
            }
    }
}

