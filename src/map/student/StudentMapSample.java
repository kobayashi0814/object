package map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのマップ
        Map<String,List<Student>> studentGroupMap = new HashMap<>(40);
        //学生のリスト
        List<Student> studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1","やまだ", Gender.MEN,60,50,70));
        studentList.add(new Student("1-1","あいだ", Gender.WOMEN,90,80,80));
        studentList.add(new Student("1-1","たけだ", Gender.MEN,50,40,90));
        studentList.add(new Student("1-2","はまだ", Gender.MEN,20,80,70));
        studentList.add(new Student("1-2","まつもと", Gender.WOMEN,90,90,90));
        studentList.add(new Student("1-2","いしだ", Gender.WOMEN,70,65,65));
        studentList.add(new Student("1-3","いけだ", Gender.MEN,20,50,30));
        studentList.add(new Student("1-3","くわた", Gender.WOMEN,90,50,80));
        studentList.add(new Student("1-3","なかがわ", Gender.MEN,60,70,90));
        studentList.add(new Student("1-4","せがわ", Gender.MEN,100,90,90));
        studentList.add(new Student("1-4","くろだ", Gender.WOMEN,50,50,50));
        studentList.add(new Student("1-4","わたべ", Gender.MEN,60,70,70));
        studentList.add(new Student("1-5","みやさこ", Gender.MEN,10,10,30));
        studentList.add(new Student("1-5","つつみ", Gender.WOMEN,55,80,75));
        studentList.add(new Student("1-5","しみず", Gender.MEN,95,100,100));

        for (Student student : studentList) {
            //マップに存在するクラスの生徒が出現
            if(studentGroupMap.containsKey(student.getGroup())) {
            //リストに追加
                studentGroupMap.get(student.getGroup()).add(student);
            } else {
                //新しいキーを作成
                //空のリストをセット
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(),list);
            }
        }

        for(Map.Entry entry: studentGroupMap.entrySet()) {
            List<Student> list = (List<Student>) entry.getValue();
            for(Student student:list) {
                System.out.println(student);
                }
            }

        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap = 0,sumMath = 0,sumEng = 0;
            for (Student student:(List<Student>)entry.getValue()) {
                sumJap += student.getJap();
                sumMath += student.getMath();
                sumEng += student.getEng();
            }
            double aveJap = sumJap /((List<?>) entry.getValue()).size();
            double aveMath = sumMath /((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List<?>) entry.getValue()).size();

            System.out.println(String.format("%s 国語平均:%.2f 数学平均:%.2f 英語平均:%.2f",
                    entry.getKey(),aveJap,aveMath,aveEng));

        }
    }
}
