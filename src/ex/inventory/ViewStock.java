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
                    new PersonalComputer("あいざわ",8,3,70000, Constants.BIT_32, Constants.MAC)
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

            //storagePriceMapからさらに計算を行う
            //倉庫ごとのPC合計金額を計算して表示
            System.out.println("//倉庫ごとの合計金額");
            for(Map.Entry entry : storagePriceMap.entrySet()) {
                double sum = 0; //合計を入れる変数を定義する
                for(Integer i : (List<Integer>)entry.getValue()) {
                sum += i;
                }
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("合計金額" + sum + "円");
            }

            //倉庫ごとの合計台数を表示
            System.out.println("//倉庫ごとの合計台数");
            for(Map.Entry entry : storagePriceMap.entrySet()) {
                int cnt = ((List)entry.getValue()).size();// 合計台数
                System.out.println("倉庫番号" + entry.getKey() + ":");
                System.out.println("合計台数" + cnt + "台");
            }

            //倉庫別に1台ごとの平均金額を表示
            System.out.println("//倉庫内の1台ごとの平均金額");
            for(Map.Entry entry : storagePriceMap.entrySet()) {
                //合計を出す
                double sum = 0;
                for(Integer i : (List<Integer>)entry.getValue()) {
                    sum += i;
                }
                //何台あるかをカウント
                int cnt =  ((List)entry.getValue()).size();
                //表示
                System.out.println("倉庫番号" +entry.getKey() + ":");
                System.out.println("平均金額" + sum / cnt + "円/台");
            }

    }
}

